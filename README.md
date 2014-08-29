helloscalatest
==============

To run all tests:

```
sbt test
```

To exclude slow tests:

```
sbt "test-only * -- -l tags.SlowTest"
```
