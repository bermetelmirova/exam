package com.example.exam;

import java.util.List;

public interface CounterService {
    List<Counter> getReport();
    Integer amount();
    void counter();
}
