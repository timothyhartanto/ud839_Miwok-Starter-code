package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NumbersActivity extends AppCompatActivity {
//    private MediaPlayer mMediaPlayer;

//    private AudioManager mAudioManager;
//
//    AudioManager.OnAudioFocusChangeListener mAudioOnFocusChangeListener =
//            new AudioManager.OnAudioFocusChangeListener() {
//                public void onAudioFocusChange(int focusChange) {
//                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
//                            focusChange == AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                        mMediaPlayer.pause();
//                        mMediaPlayer.seekTo(0);
//                    }
//                    else if (focusChange == AUDIOFOCUS_LOSS) {
//                        releaseMediaPlayer();
//                    }
//                    else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
//                        mMediaPlayer.start();
//                    }
//                }
//            };
//
//    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener(){
//        @Override
//        public void onCompletion(MediaPlayer mp) {
//            //Toast.makeText(NumbersActivity.this, "I'm done", Toast.LENGTH_SHORT).show();
//            releaseMediaPlayer();
//        }
//    };

//    @Override
//    protected void onPause() {
//        super.onPause();
//        releaseMediaPlayer();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();

       // getActionBar().setDisplayHomeAsUpEnabled(true);
//        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//
//        for(int i = 0; i < words.length; i++)
//            Log.v("NumbersActivity", words[i]);

//        mAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
//
//        final ArrayList<Word> words = new ArrayList<Word>();
//
//        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
//        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
//        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
//        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
//        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
//        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
//        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
//        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
//        words.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
//        words.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));


        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
//        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Word w = words.get(position);
//            releaseMediaPlayer();

//            int result = mAudioManager.requestAudioFocus(mAudioOnFocusChangeListener,
//                    AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//
//            if(result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED){
//                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, w.getAudioID());
//                mMediaPlayer.start();
//                mMediaPlayer.setOnCompletionListener(mCompletionListener);
//            }
//            }
//        });

//        GridView gridView = (GridView) findViewById(R.id.list);
//        gridView.setAdapter(itemsAdapter);

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.root_view);
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(0));
//        rootView.addView(wordView);
    }

    /**
     * Clean up the media player by releasing its resources.
     */
//    private void releaseMediaPlayer(){
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//
////            mAudioManager.abandonAudioFocus(mAudioOnFocusChangeListener);
//        }
//    }
}
