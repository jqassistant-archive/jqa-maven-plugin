package com.buschmais.jqassistant.scm.maven.configuration;

/**
 * Defines the valid values for the life cycle of the store.
 */
public enum StoreLifecycle {
    /**
     * Per module
     */
    MODULE,

    /**
     * Per reactor, i.e. cached.
     */
    REACTOR;

}
