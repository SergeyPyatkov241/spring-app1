package ru.pyatkov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // Урок 9, работа с init-method и destroy-method
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        // Урок 8, работа со scope бинов
        /*MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comprassion = firstMusicPlayer == secondMusicPlayer;
        System.out.println("Объекты равны? - " + comprassion);
        System.out.println("Хэш первого объекта - " + firstMusicPlayer);
        System.out.println("Хэш второго объекта - " + secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println("volume первого объекта - " + firstMusicPlayer.getVolume());
        System.out.println("volume второго объекта - " + secondMusicPlayer.getVolume());*/

        // Внедрение зависимостей и вывод значения полей бина
        /*musicPlayer.playMusic();
        System.out.println("Зависимость (поле) name - " + musicPlayer.getName());
        System.out.println("Зависимость (поле) volume - " + musicPlayer.getVolume());*/
        context.close();
    }
}
