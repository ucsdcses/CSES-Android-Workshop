//Update if part in getView of MessageAdapter

if (isPhoto) {
    messageTextView.setVisibility(View.GONE);
    photoImageView.setVisibility(View.VISIBLE);
    Glide.with(photoImageView.getContext())
            .load(message.getPhotoUrl())
            .into(photoImageView);
}