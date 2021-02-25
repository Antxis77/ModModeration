package fr.anthonydu77.modmoderation.managers.config;

/**
 * Created by Anthonydu77 13/12/2020 inside the package - fr.anthonydu77.modmoderation.managers.config
 */

public class Settings {

    private boolean message;
    private boolean join;
    private boolean leave;
    private boolean dead;
    private boolean chat;
    private boolean motd;
    private boolean maintenance;
    private int period;
    private int slot;


    public boolean isMessage() {
        return message;
    }

    public boolean isJoin() {
        return join;
    }

    public boolean isLeave() {
        return leave;
    }

    public boolean isDead() {
        return dead;
    }

    public boolean isChat() {
        return chat;
    }

    public boolean isMotd() {
        return motd;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public int getPeriod() {
        return period;
    }

    public int getSlot() {
        return slot;
    }
}
