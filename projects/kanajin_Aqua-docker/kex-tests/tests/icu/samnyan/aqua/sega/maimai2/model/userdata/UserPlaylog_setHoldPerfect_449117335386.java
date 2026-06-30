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

public class UserPlaylog_setHoldPerfect_449117335386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492619;
     Object term492719;

    public UserPlaylog_setHoldPerfect_449117335386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492619 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term492619, term492619.getClass(), "id", 0L);
        setField(term492619, term492619.getClass(), "user", null);
        setIntField(term492619, term492619.getClass(), "orderId", 0);
        setLongField(term492619, term492619.getClass(), "playlogId", 0L);
        setIntField(term492619, term492619.getClass(), "version", 0);
        setIntField(term492619, term492619.getClass(), "placeId", 0);
        setField(term492619, term492619.getClass(), "placeName", null);
        setLongField(term492619, term492619.getClass(), "loginDate", 0L);
        setField(term492619, term492619.getClass(), "playDate", null);
        setField(term492619, term492619.getClass(), "userPlayDate", null);
        setIntField(term492619, term492619.getClass(), "type", 0);
        setIntField(term492619, term492619.getClass(), "musicId", 0);
        setIntField(term492619, term492619.getClass(), "level", 0);
        setIntField(term492619, term492619.getClass(), "trackNo", 0);
        setIntField(term492619, term492619.getClass(), "vsMode", 0);
        setField(term492619, term492619.getClass(), "vsUserName", null);
        setIntField(term492619, term492619.getClass(), "vsStatus", 0);
        setIntField(term492619, term492619.getClass(), "vsUserRating", 0);
        setIntField(term492619, term492619.getClass(), "vsUserAchievement", 0);
        setIntField(term492619, term492619.getClass(), "vsUserGradeRank", 0);
        setIntField(term492619, term492619.getClass(), "vsRank", 0);
        setIntField(term492619, term492619.getClass(), "playerNum", 0);
        setLongField(term492619, term492619.getClass(), "playedUserId1", 0L);
        setField(term492619, term492619.getClass(), "playedUserName1", null);
        setIntField(term492619, term492619.getClass(), "playedMusicLevel1", 0);
        setLongField(term492619, term492619.getClass(), "playedUserId2", 0L);
        setField(term492619, term492619.getClass(), "playedUserName2", null);
        setIntField(term492619, term492619.getClass(), "playedMusicLevel2", 0);
        setLongField(term492619, term492619.getClass(), "playedUserId3", 0L);
        setField(term492619, term492619.getClass(), "playedUserName3", null);
        setIntField(term492619, term492619.getClass(), "playedMusicLevel3", 0);
        setIntField(term492619, term492619.getClass(), "characterId1", 0);
        setIntField(term492619, term492619.getClass(), "characterLevel1", 0);
        setIntField(term492619, term492619.getClass(), "characterAwakening1", 0);
        setIntField(term492619, term492619.getClass(), "characterId2", 0);
        setIntField(term492619, term492619.getClass(), "characterLevel2", 0);
        setIntField(term492619, term492619.getClass(), "characterAwakening2", 0);
        setIntField(term492619, term492619.getClass(), "characterId3", 0);
        setIntField(term492619, term492619.getClass(), "characterLevel3", 0);
        setIntField(term492619, term492619.getClass(), "characterAwakening3", 0);
        setIntField(term492619, term492619.getClass(), "characterId4", 0);
        setIntField(term492619, term492619.getClass(), "characterLevel4", 0);
        setIntField(term492619, term492619.getClass(), "characterAwakening4", 0);
        setIntField(term492619, term492619.getClass(), "characterId5", 0);
        setIntField(term492619, term492619.getClass(), "characterLevel5", 0);
        setIntField(term492619, term492619.getClass(), "characterAwakening5", 0);
        setIntField(term492619, term492619.getClass(), "achievement", 0);
        setIntField(term492619, term492619.getClass(), "deluxscore", 0);
        setIntField(term492619, term492619.getClass(), "scoreRank", 0);
        setIntField(term492619, term492619.getClass(), "maxCombo", 0);
        setIntField(term492619, term492619.getClass(), "totalCombo", 0);
        setIntField(term492619, term492619.getClass(), "maxSync", 0);
        setIntField(term492619, term492619.getClass(), "totalSync", 0);
        setIntField(term492619, term492619.getClass(), "tapCriticalPerfect", 0);
        setIntField(term492619, term492619.getClass(), "tapPerfect", 0);
        setIntField(term492619, term492619.getClass(), "tapGreat", 0);
        setIntField(term492619, term492619.getClass(), "tapGood", 0);
        setIntField(term492619, term492619.getClass(), "tapMiss", 0);
        setIntField(term492619, term492619.getClass(), "holdCriticalPerfect", 0);
        setIntField(term492619, term492619.getClass(), "holdPerfect", 0);
        setIntField(term492619, term492619.getClass(), "holdGreat", 0);
        setIntField(term492619, term492619.getClass(), "holdGood", 0);
        setIntField(term492619, term492619.getClass(), "holdMiss", 0);
        setIntField(term492619, term492619.getClass(), "slideCriticalPerfect", 0);
        setIntField(term492619, term492619.getClass(), "slidePerfect", 0);
        setIntField(term492619, term492619.getClass(), "slideGreat", 0);
        setIntField(term492619, term492619.getClass(), "slideGood", 0);
        setIntField(term492619, term492619.getClass(), "slideMiss", 0);
        setIntField(term492619, term492619.getClass(), "touchCriticalPerfect", 0);
        setIntField(term492619, term492619.getClass(), "touchPerfect", 0);
        setIntField(term492619, term492619.getClass(), "touchGreat", 0);
        setIntField(term492619, term492619.getClass(), "touchGood", 0);
        setIntField(term492619, term492619.getClass(), "touchMiss", 0);
        setIntField(term492619, term492619.getClass(), "breakCriticalPerfect", 0);
        setIntField(term492619, term492619.getClass(), "breakPerfect", 0);
        setIntField(term492619, term492619.getClass(), "breakGreat", 0);
        setIntField(term492619, term492619.getClass(), "breakGood", 0);
        setIntField(term492619, term492619.getClass(), "breakMiss", 0);
        setBooleanField(term492619, term492619.getClass(), "isTap", false);
        setBooleanField(term492619, term492619.getClass(), "isHold", false);
        setBooleanField(term492619, term492619.getClass(), "isSlide", false);
        setBooleanField(term492619, term492619.getClass(), "isTouch", false);
        setBooleanField(term492619, term492619.getClass(), "isBreak", false);
        setBooleanField(term492619, term492619.getClass(), "isCriticalDisp", false);
        setBooleanField(term492619, term492619.getClass(), "isFastLateDisp", false);
        setIntField(term492619, term492619.getClass(), "fastCount", 0);
        setIntField(term492619, term492619.getClass(), "lateCount", 0);
        setBooleanField(term492619, term492619.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term492619, term492619.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term492619, term492619.getClass(), "comboStatus", 0);
        setIntField(term492619, term492619.getClass(), "syncStatus", 0);
        setBooleanField(term492619, term492619.getClass(), "isClear", false);
        setIntField(term492619, term492619.getClass(), "beforeRating", 0);
        setIntField(term492619, term492619.getClass(), "afterRating", 0);
        setIntField(term492619, term492619.getClass(), "beforeGrade", 0);
        setIntField(term492619, term492619.getClass(), "afterGrade", 0);
        setIntField(term492619, term492619.getClass(), "afterGradeRank", 0);
        setIntField(term492619, term492619.getClass(), "beforeDeluxRating", 0);
        setIntField(term492619, term492619.getClass(), "afterDeluxRating", 0);
        setBooleanField(term492619, term492619.getClass(), "isPlayTutorial", false);
        setBooleanField(term492619, term492619.getClass(), "isEventMode", false);
        setBooleanField(term492619, term492619.getClass(), "isFreedomMode", false);
        setIntField(term492619, term492619.getClass(), "playMode", 0);
        setBooleanField(term492619, term492619.getClass(), "isNewFree", false);
        setIntField(term492619, term492619.getClass(), "trialPlayAchievement", 0);
        setIntField(term492619, term492619.getClass(), "extNum1", 0);
        setIntField(term492619, term492619.getClass(), "extNum2", 0);
        term492719 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term492719;
        callMethod(klass, "setHoldPerfect", argTypes, term492619, args);
    }

};


