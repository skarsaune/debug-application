#!/bin/bash -x
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8765 -cp target/test-classes com.example.ConsoleApplication
