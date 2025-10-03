package org.example;

public interface Producer {
    Status publish(Message message, int partition_id);
    int totalPartitions();
}
