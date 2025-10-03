package org.example;

public interface Consumer {
    Status consume(int partition_id);
}
