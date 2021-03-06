/*
 * Copyright 2013-2014 by Daniel Lemire, Owen Kaser and Samy Chambi
 * Licensed under the Apache License, Version 2.0.
 */
package org.roaringbitmap;

/**
 * @author lemire
 *
 */
public interface ShortIterator {
        /**
         * @return whether there is another value
         */
        public boolean hasNext();

        /**
         * @return next short value
         */
        public short next();
        /**
         * remove current value
         */
        public void remove();

}
