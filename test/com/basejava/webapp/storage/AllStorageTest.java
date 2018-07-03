package com.basejava.webapp.storage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArrayStorageTest.class,
        SortedArrayArrayStorageTest.class,
        ListArrayStorageTest.class,
        MapUuidStorageTest.class,
        MapResumeStorageTest.class
})
public class AllStorageTest {}
