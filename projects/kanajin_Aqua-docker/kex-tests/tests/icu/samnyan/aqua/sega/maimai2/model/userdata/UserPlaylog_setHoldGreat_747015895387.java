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

public class UserPlaylog_setHoldGreat_747015895387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492721;
     Object term492821;

    public UserPlaylog_setHoldGreat_747015895387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492721 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term492721, term492721.getClass(), "id", 0L);
        setField(term492721, term492721.getClass(), "user", null);
        setIntField(term492721, term492721.getClass(), "orderId", 0);
        setLongField(term492721, term492721.getClass(), "playlogId", 0L);
        setIntField(term492721, term492721.getClass(), "version", 0);
        setIntField(term492721, term492721.getClass(), "placeId", 0);
        setField(term492721, term492721.getClass(), "placeName", null);
        setLongField(term492721, term492721.getClass(), "loginDate", 0L);
        setField(term492721, term492721.getClass(), "playDate", null);
        setField(term492721, term492721.getClass(), "userPlayDate", null);
        setIntField(term492721, term492721.getClass(), "type", 0);
        setIntField(term492721, term492721.getClass(), "musicId", 0);
        setIntField(term492721, term492721.getClass(), "level", 0);
        setIntField(term492721, term492721.getClass(), "trackNo", 0);
        setIntField(term492721, term492721.getClass(), "vsMode", 0);
        setField(term492721, term492721.getClass(), "vsUserName", null);
        setIntField(term492721, term492721.getClass(), "vsStatus", 0);
        setIntField(term492721, term492721.getClass(), "vsUserRating", 0);
        setIntField(term492721, term492721.getClass(), "vsUserAchievement", 0);
        setIntField(term492721, term492721.getClass(), "vsUserGradeRank", 0);
        setIntField(term492721, term492721.getClass(), "vsRank", 0);
        setIntField(term492721, term492721.getClass(), "playerNum", 0);
        setLongField(term492721, term492721.getClass(), "playedUserId1", 0L);
        setField(term492721, term492721.getClass(), "playedUserName1", null);
        setIntField(term492721, term492721.getClass(), "playedMusicLevel1", 0);
        setLongField(term492721, term492721.getClass(), "playedUserId2", 0L);
        setField(term492721, term492721.getClass(), "playedUserName2", null);
        setIntField(term492721, term492721.getClass(), "playedMusicLevel2", 0);
        setLongField(term492721, term492721.getClass(), "playedUserId3", 0L);
        setField(term492721, term492721.getClass(), "playedUserName3", null);
        setIntField(term492721, term492721.getClass(), "playedMusicLevel3", 0);
        setIntField(term492721, term492721.getClass(), "characterId1", 0);
        setIntField(term492721, term492721.getClass(), "characterLevel1", 0);
        setIntField(term492721, term492721.getClass(), "characterAwakening1", 0);
        setIntField(term492721, term492721.getClass(), "characterId2", 0);
        setIntField(term492721, term492721.getClass(), "characterLevel2", 0);
        setIntField(term492721, term492721.getClass(), "characterAwakening2", 0);
        setIntField(term492721, term492721.getClass(), "characterId3", 0);
        setIntField(term492721, term492721.getClass(), "characterLevel3", 0);
        setIntField(term492721, term492721.getClass(), "characterAwakening3", 0);
        setIntField(term492721, term492721.getClass(), "characterId4", 0);
        setIntField(term492721, term492721.getClass(), "characterLevel4", 0);
        setIntField(term492721, term492721.getClass(), "characterAwakening4", 0);
        setIntField(term492721, term492721.getClass(), "characterId5", 0);
        setIntField(term492721, term492721.getClass(), "characterLevel5", 0);
        setIntField(term492721, term492721.getClass(), "characterAwakening5", 0);
        setIntField(term492721, term492721.getClass(), "achievement", 0);
        setIntField(term492721, term492721.getClass(), "deluxscore", 0);
        setIntField(term492721, term492721.getClass(), "scoreRank", 0);
        setIntField(term492721, term492721.getClass(), "maxCombo", 0);
        setIntField(term492721, term492721.getClass(), "totalCombo", 0);
        setIntField(term492721, term492721.getClass(), "maxSync", 0);
        setIntField(term492721, term492721.getClass(), "totalSync", 0);
        setIntField(term492721, term492721.getClass(), "tapCriticalPerfect", 0);
        setIntField(term492721, term492721.getClass(), "tapPerfect", 0);
        setIntField(term492721, term492721.getClass(), "tapGreat", 0);
        setIntField(term492721, term492721.getClass(), "tapGood", 0);
        setIntField(term492721, term492721.getClass(), "tapMiss", 0);
        setIntField(term492721, term492721.getClass(), "holdCriticalPerfect", 0);
        setIntField(term492721, term492721.getClass(), "holdPerfect", 0);
        setIntField(term492721, term492721.getClass(), "holdGreat", 0);
        setIntField(term492721, term492721.getClass(), "holdGood", 0);
        setIntField(term492721, term492721.getClass(), "holdMiss", 0);
        setIntField(term492721, term492721.getClass(), "slideCriticalPerfect", 0);
        setIntField(term492721, term492721.getClass(), "slidePerfect", 0);
        setIntField(term492721, term492721.getClass(), "slideGreat", 0);
        setIntField(term492721, term492721.getClass(), "slideGood", 0);
        setIntField(term492721, term492721.getClass(), "slideMiss", 0);
        setIntField(term492721, term492721.getClass(), "touchCriticalPerfect", 0);
        setIntField(term492721, term492721.getClass(), "touchPerfect", 0);
        setIntField(term492721, term492721.getClass(), "touchGreat", 0);
        setIntField(term492721, term492721.getClass(), "touchGood", 0);
        setIntField(term492721, term492721.getClass(), "touchMiss", 0);
        setIntField(term492721, term492721.getClass(), "breakCriticalPerfect", 0);
        setIntField(term492721, term492721.getClass(), "breakPerfect", 0);
        setIntField(term492721, term492721.getClass(), "breakGreat", 0);
        setIntField(term492721, term492721.getClass(), "breakGood", 0);
        setIntField(term492721, term492721.getClass(), "breakMiss", 0);
        setBooleanField(term492721, term492721.getClass(), "isTap", false);
        setBooleanField(term492721, term492721.getClass(), "isHold", false);
        setBooleanField(term492721, term492721.getClass(), "isSlide", false);
        setBooleanField(term492721, term492721.getClass(), "isTouch", false);
        setBooleanField(term492721, term492721.getClass(), "isBreak", false);
        setBooleanField(term492721, term492721.getClass(), "isCriticalDisp", false);
        setBooleanField(term492721, term492721.getClass(), "isFastLateDisp", false);
        setIntField(term492721, term492721.getClass(), "fastCount", 0);
        setIntField(term492721, term492721.getClass(), "lateCount", 0);
        setBooleanField(term492721, term492721.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term492721, term492721.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term492721, term492721.getClass(), "comboStatus", 0);
        setIntField(term492721, term492721.getClass(), "syncStatus", 0);
        setBooleanField(term492721, term492721.getClass(), "isClear", false);
        setIntField(term492721, term492721.getClass(), "beforeRating", 0);
        setIntField(term492721, term492721.getClass(), "afterRating", 0);
        setIntField(term492721, term492721.getClass(), "beforeGrade", 0);
        setIntField(term492721, term492721.getClass(), "afterGrade", 0);
        setIntField(term492721, term492721.getClass(), "afterGradeRank", 0);
        setIntField(term492721, term492721.getClass(), "beforeDeluxRating", 0);
        setIntField(term492721, term492721.getClass(), "afterDeluxRating", 0);
        setBooleanField(term492721, term492721.getClass(), "isPlayTutorial", false);
        setBooleanField(term492721, term492721.getClass(), "isEventMode", false);
        setBooleanField(term492721, term492721.getClass(), "isFreedomMode", false);
        setIntField(term492721, term492721.getClass(), "playMode", 0);
        setBooleanField(term492721, term492721.getClass(), "isNewFree", false);
        setIntField(term492721, term492721.getClass(), "trialPlayAchievement", 0);
        setIntField(term492721, term492721.getClass(), "extNum1", 0);
        setIntField(term492721, term492721.getClass(), "extNum2", 0);
        term492821 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term492821;
        callMethod(klass, "setHoldGreat", argTypes, term492721, args);
    }

};


