package icu.samnyan.aqua.sega.maimai2.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserPlaylog_setCharacterLevel3_544380545365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490477;
     Object term490577;

    public UserPlaylog_setCharacterLevel3_544380545365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490477 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term490477, term490477.getClass(), "id", 0L);
        setField(term490477, term490477.getClass(), "user", null);
        setIntField(term490477, term490477.getClass(), "orderId", 0);
        setLongField(term490477, term490477.getClass(), "playlogId", 0L);
        setIntField(term490477, term490477.getClass(), "version", 0);
        setIntField(term490477, term490477.getClass(), "placeId", 0);
        setField(term490477, term490477.getClass(), "placeName", null);
        setLongField(term490477, term490477.getClass(), "loginDate", 0L);
        setField(term490477, term490477.getClass(), "playDate", null);
        setField(term490477, term490477.getClass(), "userPlayDate", null);
        setIntField(term490477, term490477.getClass(), "type", 0);
        setIntField(term490477, term490477.getClass(), "musicId", 0);
        setIntField(term490477, term490477.getClass(), "level", 0);
        setIntField(term490477, term490477.getClass(), "trackNo", 0);
        setIntField(term490477, term490477.getClass(), "vsMode", 0);
        setField(term490477, term490477.getClass(), "vsUserName", null);
        setIntField(term490477, term490477.getClass(), "vsStatus", 0);
        setIntField(term490477, term490477.getClass(), "vsUserRating", 0);
        setIntField(term490477, term490477.getClass(), "vsUserAchievement", 0);
        setIntField(term490477, term490477.getClass(), "vsUserGradeRank", 0);
        setIntField(term490477, term490477.getClass(), "vsRank", 0);
        setIntField(term490477, term490477.getClass(), "playerNum", 0);
        setLongField(term490477, term490477.getClass(), "playedUserId1", 0L);
        setField(term490477, term490477.getClass(), "playedUserName1", null);
        setIntField(term490477, term490477.getClass(), "playedMusicLevel1", 0);
        setLongField(term490477, term490477.getClass(), "playedUserId2", 0L);
        setField(term490477, term490477.getClass(), "playedUserName2", null);
        setIntField(term490477, term490477.getClass(), "playedMusicLevel2", 0);
        setLongField(term490477, term490477.getClass(), "playedUserId3", 0L);
        setField(term490477, term490477.getClass(), "playedUserName3", null);
        setIntField(term490477, term490477.getClass(), "playedMusicLevel3", 0);
        setIntField(term490477, term490477.getClass(), "characterId1", 0);
        setIntField(term490477, term490477.getClass(), "characterLevel1", 0);
        setIntField(term490477, term490477.getClass(), "characterAwakening1", 0);
        setIntField(term490477, term490477.getClass(), "characterId2", 0);
        setIntField(term490477, term490477.getClass(), "characterLevel2", 0);
        setIntField(term490477, term490477.getClass(), "characterAwakening2", 0);
        setIntField(term490477, term490477.getClass(), "characterId3", 0);
        setIntField(term490477, term490477.getClass(), "characterLevel3", 0);
        setIntField(term490477, term490477.getClass(), "characterAwakening3", 0);
        setIntField(term490477, term490477.getClass(), "characterId4", 0);
        setIntField(term490477, term490477.getClass(), "characterLevel4", 0);
        setIntField(term490477, term490477.getClass(), "characterAwakening4", 0);
        setIntField(term490477, term490477.getClass(), "characterId5", 0);
        setIntField(term490477, term490477.getClass(), "characterLevel5", 0);
        setIntField(term490477, term490477.getClass(), "characterAwakening5", 0);
        setIntField(term490477, term490477.getClass(), "achievement", 0);
        setIntField(term490477, term490477.getClass(), "deluxscore", 0);
        setIntField(term490477, term490477.getClass(), "scoreRank", 0);
        setIntField(term490477, term490477.getClass(), "maxCombo", 0);
        setIntField(term490477, term490477.getClass(), "totalCombo", 0);
        setIntField(term490477, term490477.getClass(), "maxSync", 0);
        setIntField(term490477, term490477.getClass(), "totalSync", 0);
        setIntField(term490477, term490477.getClass(), "tapCriticalPerfect", 0);
        setIntField(term490477, term490477.getClass(), "tapPerfect", 0);
        setIntField(term490477, term490477.getClass(), "tapGreat", 0);
        setIntField(term490477, term490477.getClass(), "tapGood", 0);
        setIntField(term490477, term490477.getClass(), "tapMiss", 0);
        setIntField(term490477, term490477.getClass(), "holdCriticalPerfect", 0);
        setIntField(term490477, term490477.getClass(), "holdPerfect", 0);
        setIntField(term490477, term490477.getClass(), "holdGreat", 0);
        setIntField(term490477, term490477.getClass(), "holdGood", 0);
        setIntField(term490477, term490477.getClass(), "holdMiss", 0);
        setIntField(term490477, term490477.getClass(), "slideCriticalPerfect", 0);
        setIntField(term490477, term490477.getClass(), "slidePerfect", 0);
        setIntField(term490477, term490477.getClass(), "slideGreat", 0);
        setIntField(term490477, term490477.getClass(), "slideGood", 0);
        setIntField(term490477, term490477.getClass(), "slideMiss", 0);
        setIntField(term490477, term490477.getClass(), "touchCriticalPerfect", 0);
        setIntField(term490477, term490477.getClass(), "touchPerfect", 0);
        setIntField(term490477, term490477.getClass(), "touchGreat", 0);
        setIntField(term490477, term490477.getClass(), "touchGood", 0);
        setIntField(term490477, term490477.getClass(), "touchMiss", 0);
        setIntField(term490477, term490477.getClass(), "breakCriticalPerfect", 0);
        setIntField(term490477, term490477.getClass(), "breakPerfect", 0);
        setIntField(term490477, term490477.getClass(), "breakGreat", 0);
        setIntField(term490477, term490477.getClass(), "breakGood", 0);
        setIntField(term490477, term490477.getClass(), "breakMiss", 0);
        setBooleanField(term490477, term490477.getClass(), "isTap", false);
        setBooleanField(term490477, term490477.getClass(), "isHold", false);
        setBooleanField(term490477, term490477.getClass(), "isSlide", false);
        setBooleanField(term490477, term490477.getClass(), "isTouch", false);
        setBooleanField(term490477, term490477.getClass(), "isBreak", false);
        setBooleanField(term490477, term490477.getClass(), "isCriticalDisp", false);
        setBooleanField(term490477, term490477.getClass(), "isFastLateDisp", false);
        setIntField(term490477, term490477.getClass(), "fastCount", 0);
        setIntField(term490477, term490477.getClass(), "lateCount", 0);
        setBooleanField(term490477, term490477.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term490477, term490477.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term490477, term490477.getClass(), "comboStatus", 0);
        setIntField(term490477, term490477.getClass(), "syncStatus", 0);
        setBooleanField(term490477, term490477.getClass(), "isClear", false);
        setIntField(term490477, term490477.getClass(), "beforeRating", 0);
        setIntField(term490477, term490477.getClass(), "afterRating", 0);
        setIntField(term490477, term490477.getClass(), "beforeGrade", 0);
        setIntField(term490477, term490477.getClass(), "afterGrade", 0);
        setIntField(term490477, term490477.getClass(), "afterGradeRank", 0);
        setIntField(term490477, term490477.getClass(), "beforeDeluxRating", 0);
        setIntField(term490477, term490477.getClass(), "afterDeluxRating", 0);
        setBooleanField(term490477, term490477.getClass(), "isPlayTutorial", false);
        setBooleanField(term490477, term490477.getClass(), "isEventMode", false);
        setBooleanField(term490477, term490477.getClass(), "isFreedomMode", false);
        setIntField(term490477, term490477.getClass(), "playMode", 0);
        setBooleanField(term490477, term490477.getClass(), "isNewFree", false);
        setIntField(term490477, term490477.getClass(), "trialPlayAchievement", 0);
        setIntField(term490477, term490477.getClass(), "extNum1", 0);
        setIntField(term490477, term490477.getClass(), "extNum2", 0);
        term490577 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term490577;
        callMethod(klass, "setCharacterLevel3", argTypes, term490477, args);
    }

};


