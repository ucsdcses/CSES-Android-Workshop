@Override
protected void onResume() 
{
    super.onResume();
    attachDatabaseReadListener();
}

@Override
protected void onPause() 
{
    super.onPause();
    mMessageAdapter.clear();
    detachDatabaseReadListener();
}