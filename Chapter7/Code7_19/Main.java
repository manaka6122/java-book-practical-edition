package Chapter7.Code7_19;
import javax.sound.midi.*;
import javax.sound.sampled.*;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // MIDIでBGMをシンセサイザ(シーケンサ)の準備
    Sequencer seq = MidiSystem.getSequencer();
    seq.open();
    seq.setSequence(MidiSystem.getSequence(new File("xmas-bgm.mid")));
    seq.setLoopCount(-1);  // ループ再生を行わない処理
    seq.start();           // 演奏開始

    // クリスマスのベルの音をWAVから読み取る準備
    AudioInputStream ais = AudioSystem.getAudioInputStream(new File("xmas-bell.wav"));
    Clip clip = AudioSystem.getClip();
    clip.open(ais);

    System.out.println("メリークリスマス！");
    System.out.println("何か入力すると3回だけベルが鳴るよ");

    for (int i = 0; i < 4; i++) {
      new Scanner(System.in).nextLine();
      clip.start();
      clip.setFramePosition(0);
    }

    // サンプリング音声の終了
    clip.stop();
    ais.close();
    // MIDIシンサイザの終了
    seq.stop();
    ais.close();
  }
}
