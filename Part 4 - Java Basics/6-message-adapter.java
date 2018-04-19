@Override
public View getView(int position, View convertView, ViewGroup parent) 
{
    if (convertView == null) {
        convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
    }

    ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
    TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
    TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);

    FriendlyMessage message = getItem(position);

    boolean isPhoto = message.getPhotoUrl() != null;
    if (isPhoto) 
    {

        messageTextView.setVisibility(View.GONE);
        photoImageView.setVisibility(View.VISIBLE);
        //TODO

    } 
    else 
    {
        messageTextView.setVisibility(View.VISIBLE);
        photoImageView.setVisibility(View.GONE);
        messageTextView.setText(message.getText());
    }
    authorTextView.setText(message.getName());
    return convertView;
}