package com.smalaca.trycatchfinally;

class Finally {

    private boolean finallyWasReached = false;

    int giveMeSomething(boolean throwException) {
        try {
            if (throwException)
                throw new Exception(); 
            
            return 13;
        } catch (Exception e) {
            return -1;
        } finally {
            return 0;
        }
    }
    
    int manageException(boolean throwException) {
        try {
            if (throwException)
                throw new Exception(); 
            
            return 13;
        } catch (Exception e) {
            return -1;
        } finally {
            doWhatNeedsToBeDone();
        }
    }

    void letMeToPassException(boolean throwException) throws Exception {
        try {
            if (throwException)
                throw new Exception(); 
        } finally {
            doWhatNeedsToBeDone();
        }
    }
    
    boolean wasFinallyReached() {
        return finallyWasReached;
    }
    
    private void doWhatNeedsToBeDone() {
        finallyWasReached = true;
    }
}
