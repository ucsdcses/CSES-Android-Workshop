private void detachDatabaseReadListener() 
{
    if (mChildEventListener != null) 
    {
        mMessagesDatabaseReference.removeEventListener(mChildEventListener);
        mChildEventListener = null;
    }
}