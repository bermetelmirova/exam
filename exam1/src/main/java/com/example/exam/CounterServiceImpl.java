package com.example.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CounterServiceImpl implements CounterService {
    @Autowired
    CounterRepository counterRepository;

    @Override
    public List<Counter> getReport() {
        return counterRepository.findAll();
    }

    @Override
    public Integer amount() {
        Counter counter = counterRepository.findLast().orElse(null);
        if (counter == null)
            return  0;
        return counter.getCount();
    }

    @Override
    public void counter() {
        Counter counter = counterRepository.findLast().orElse(null);
        Integer count;
        if (counter == null)
            count = 1;
        count = counter.getCount() + 1;
        counterRepository.save(Counter.builder()
                .count(count)
                .build()
        );
    }
}
