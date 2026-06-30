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

public class UserPlaylog_setTapGreat_1596733641382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492211;
     Object term492311;

    public UserPlaylog_setTapGreat_1596733641382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492211 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term492211, term492211.getClass(), "id", 0L);
        setField(term492211, term492211.getClass(), "user", null);
        setIntField(term492211, term492211.getClass(), "orderId", 0);
        setLongField(term492211, term492211.getClass(), "playlogId", 0L);
        setIntField(term492211, term492211.getClass(), "version", 0);
        setIntField(term492211, term492211.getClass(), "placeId", 0);
        setField(term492211, term492211.getClass(), "placeName", null);
        setLongField(term492211, term492211.getClass(), "loginDate", 0L);
        setField(term492211, term492211.getClass(), "playDate", null);
        setField(term492211, term492211.getClass(), "userPlayDate", null);
        setIntField(term492211, term492211.getClass(), "type", 0);
        setIntField(term492211, term492211.getClass(), "musicId", 0);
        setIntField(term492211, term492211.getClass(), "level", 0);
        setIntField(term492211, term492211.getClass(), "trackNo", 0);
        setIntField(term492211, term492211.getClass(), "vsMode", 0);
        setField(term492211, term492211.getClass(), "vsUserName", null);
        setIntField(term492211, term492211.getClass(), "vsStatus", 0);
        setIntField(term492211, term492211.getClass(), "vsUserRating", 0);
        setIntField(term492211, term492211.getClass(), "vsUserAchievement", 0);
        setIntField(term492211, term492211.getClass(), "vsUserGradeRank", 0);
        setIntField(term492211, term492211.getClass(), "vsRank", 0);
        setIntField(term492211, term492211.getClass(), "playerNum", 0);
        setLongField(term492211, term492211.getClass(), "playedUserId1", 0L);
        setField(term492211, term492211.getClass(), "playedUserName1", null);
        setIntField(term492211, term492211.getClass(), "playedMusicLevel1", 0);
        setLongField(term492211, term492211.getClass(), "playedUserId2", 0L);
        setField(term492211, term492211.getClass(), "playedUserName2", null);
        setIntField(term492211, term492211.getClass(), "playedMusicLevel2", 0);
        setLongField(term492211, term492211.getClass(), "playedUserId3", 0L);
        setField(term492211, term492211.getClass(), "playedUserName3", null);
        setIntField(term492211, term492211.getClass(), "playedMusicLevel3", 0);
        setIntField(term492211, term492211.getClass(), "characterId1", 0);
        setIntField(term492211, term492211.getClass(), "characterLevel1", 0);
        setIntField(term492211, term492211.getClass(), "characterAwakening1", 0);
        setIntField(term492211, term492211.getClass(), "characterId2", 0);
        setIntField(term492211, term492211.getClass(), "characterLevel2", 0);
        setIntField(term492211, term492211.getClass(), "characterAwakening2", 0);
        setIntField(term492211, term492211.getClass(), "characterId3", 0);
        setIntField(term492211, term492211.getClass(), "characterLevel3", 0);
        setIntField(term492211, term492211.getClass(), "characterAwakening3", 0);
        setIntField(term492211, term492211.getClass(), "characterId4", 0);
        setIntField(term492211, term492211.getClass(), "characterLevel4", 0);
        setIntField(term492211, term492211.getClass(), "characterAwakening4", 0);
        setIntField(term492211, term492211.getClass(), "characterId5", 0);
        setIntField(term492211, term492211.getClass(), "characterLevel5", 0);
        setIntField(term492211, term492211.getClass(), "characterAwakening5", 0);
        setIntField(term492211, term492211.getClass(), "achievement", 0);
        setIntField(term492211, term492211.getClass(), "deluxscore", 0);
        setIntField(term492211, term492211.getClass(), "scoreRank", 0);
        setIntField(term492211, term492211.getClass(), "maxCombo", 0);
        setIntField(term492211, term492211.getClass(), "totalCombo", 0);
        setIntField(term492211, term492211.getClass(), "maxSync", 0);
        setIntField(term492211, term492211.getClass(), "totalSync", 0);
        setIntField(term492211, term492211.getClass(), "tapCriticalPerfect", 0);
        setIntField(term492211, term492211.getClass(), "tapPerfect", 0);
        setIntField(term492211, term492211.getClass(), "tapGreat", 0);
        setIntField(term492211, term492211.getClass(), "tapGood", 0);
        setIntField(term492211, term492211.getClass(), "tapMiss", 0);
        setIntField(term492211, term492211.getClass(), "holdCriticalPerfect", 0);
        setIntField(term492211, term492211.getClass(), "holdPerfect", 0);
        setIntField(term492211, term492211.getClass(), "holdGreat", 0);
        setIntField(term492211, term492211.getClass(), "holdGood", 0);
        setIntField(term492211, term492211.getClass(), "holdMiss", 0);
        setIntField(term492211, term492211.getClass(), "slideCriticalPerfect", 0);
        setIntField(term492211, term492211.getClass(), "slidePerfect", 0);
        setIntField(term492211, term492211.getClass(), "slideGreat", 0);
        setIntField(term492211, term492211.getClass(), "slideGood", 0);
        setIntField(term492211, term492211.getClass(), "slideMiss", 0);
        setIntField(term492211, term492211.getClass(), "touchCriticalPerfect", 0);
        setIntField(term492211, term492211.getClass(), "touchPerfect", 0);
        setIntField(term492211, term492211.getClass(), "touchGreat", 0);
        setIntField(term492211, term492211.getClass(), "touchGood", 0);
        setIntField(term492211, term492211.getClass(), "touchMiss", 0);
        setIntField(term492211, term492211.getClass(), "breakCriticalPerfect", 0);
        setIntField(term492211, term492211.getClass(), "breakPerfect", 0);
        setIntField(term492211, term492211.getClass(), "breakGreat", 0);
        setIntField(term492211, term492211.getClass(), "breakGood", 0);
        setIntField(term492211, term492211.getClass(), "breakMiss", 0);
        setBooleanField(term492211, term492211.getClass(), "isTap", false);
        setBooleanField(term492211, term492211.getClass(), "isHold", false);
        setBooleanField(term492211, term492211.getClass(), "isSlide", false);
        setBooleanField(term492211, term492211.getClass(), "isTouch", false);
        setBooleanField(term492211, term492211.getClass(), "isBreak", false);
        setBooleanField(term492211, term492211.getClass(), "isCriticalDisp", false);
        setBooleanField(term492211, term492211.getClass(), "isFastLateDisp", false);
        setIntField(term492211, term492211.getClass(), "fastCount", 0);
        setIntField(term492211, term492211.getClass(), "lateCount", 0);
        setBooleanField(term492211, term492211.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term492211, term492211.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term492211, term492211.getClass(), "comboStatus", 0);
        setIntField(term492211, term492211.getClass(), "syncStatus", 0);
        setBooleanField(term492211, term492211.getClass(), "isClear", false);
        setIntField(term492211, term492211.getClass(), "beforeRating", 0);
        setIntField(term492211, term492211.getClass(), "afterRating", 0);
        setIntField(term492211, term492211.getClass(), "beforeGrade", 0);
        setIntField(term492211, term492211.getClass(), "afterGrade", 0);
        setIntField(term492211, term492211.getClass(), "afterGradeRank", 0);
        setIntField(term492211, term492211.getClass(), "beforeDeluxRating", 0);
        setIntField(term492211, term492211.getClass(), "afterDeluxRating", 0);
        setBooleanField(term492211, term492211.getClass(), "isPlayTutorial", false);
        setBooleanField(term492211, term492211.getClass(), "isEventMode", false);
        setBooleanField(term492211, term492211.getClass(), "isFreedomMode", false);
        setIntField(term492211, term492211.getClass(), "playMode", 0);
        setBooleanField(term492211, term492211.getClass(), "isNewFree", false);
        setIntField(term492211, term492211.getClass(), "trialPlayAchievement", 0);
        setIntField(term492211, term492211.getClass(), "extNum1", 0);
        setIntField(term492211, term492211.getClass(), "extNum2", 0);
        term492311 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term492311;
        callMethod(klass, "setTapGreat", argTypes, term492211, args);
    }

};


