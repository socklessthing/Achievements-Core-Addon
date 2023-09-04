package issame.achievements_core.achievements.style;

import issame.achievements_core.achievements.Achievement;

public class StyleChallenge extends StyleDefault {
    @Override
    public String getFormatString() {
        return "§5";
    }

    @Override
    public String getAnnounceMessage() {
        return "achievement.announce.challenge";
    }

    @Override
    public int getU() {
        return Achievement.SIZE;
    }
}
