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

public class UserPlaylog_setVsUserGradeRank_1982906012346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488545;
     Object term488645;

    public UserPlaylog_setVsUserGradeRank_1982906012346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488545 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term488545, term488545.getClass(), "id", 0L);
        setField(term488545, term488545.getClass(), "user", null);
        setIntField(term488545, term488545.getClass(), "orderId", 0);
        setLongField(term488545, term488545.getClass(), "playlogId", 0L);
        setIntField(term488545, term488545.getClass(), "version", 0);
        setIntField(term488545, term488545.getClass(), "placeId", 0);
        setField(term488545, term488545.getClass(), "placeName", null);
        setLongField(term488545, term488545.getClass(), "loginDate", 0L);
        setField(term488545, term488545.getClass(), "playDate", null);
        setField(term488545, term488545.getClass(), "userPlayDate", null);
        setIntField(term488545, term488545.getClass(), "type", 0);
        setIntField(term488545, term488545.getClass(), "musicId", 0);
        setIntField(term488545, term488545.getClass(), "level", 0);
        setIntField(term488545, term488545.getClass(), "trackNo", 0);
        setIntField(term488545, term488545.getClass(), "vsMode", 0);
        setField(term488545, term488545.getClass(), "vsUserName", null);
        setIntField(term488545, term488545.getClass(), "vsStatus", 0);
        setIntField(term488545, term488545.getClass(), "vsUserRating", 0);
        setIntField(term488545, term488545.getClass(), "vsUserAchievement", 0);
        setIntField(term488545, term488545.getClass(), "vsUserGradeRank", 0);
        setIntField(term488545, term488545.getClass(), "vsRank", 0);
        setIntField(term488545, term488545.getClass(), "playerNum", 0);
        setLongField(term488545, term488545.getClass(), "playedUserId1", 0L);
        setField(term488545, term488545.getClass(), "playedUserName1", null);
        setIntField(term488545, term488545.getClass(), "playedMusicLevel1", 0);
        setLongField(term488545, term488545.getClass(), "playedUserId2", 0L);
        setField(term488545, term488545.getClass(), "playedUserName2", null);
        setIntField(term488545, term488545.getClass(), "playedMusicLevel2", 0);
        setLongField(term488545, term488545.getClass(), "playedUserId3", 0L);
        setField(term488545, term488545.getClass(), "playedUserName3", null);
        setIntField(term488545, term488545.getClass(), "playedMusicLevel3", 0);
        setIntField(term488545, term488545.getClass(), "characterId1", 0);
        setIntField(term488545, term488545.getClass(), "characterLevel1", 0);
        setIntField(term488545, term488545.getClass(), "characterAwakening1", 0);
        setIntField(term488545, term488545.getClass(), "characterId2", 0);
        setIntField(term488545, term488545.getClass(), "characterLevel2", 0);
        setIntField(term488545, term488545.getClass(), "characterAwakening2", 0);
        setIntField(term488545, term488545.getClass(), "characterId3", 0);
        setIntField(term488545, term488545.getClass(), "characterLevel3", 0);
        setIntField(term488545, term488545.getClass(), "characterAwakening3", 0);
        setIntField(term488545, term488545.getClass(), "characterId4", 0);
        setIntField(term488545, term488545.getClass(), "characterLevel4", 0);
        setIntField(term488545, term488545.getClass(), "characterAwakening4", 0);
        setIntField(term488545, term488545.getClass(), "characterId5", 0);
        setIntField(term488545, term488545.getClass(), "characterLevel5", 0);
        setIntField(term488545, term488545.getClass(), "characterAwakening5", 0);
        setIntField(term488545, term488545.getClass(), "achievement", 0);
        setIntField(term488545, term488545.getClass(), "deluxscore", 0);
        setIntField(term488545, term488545.getClass(), "scoreRank", 0);
        setIntField(term488545, term488545.getClass(), "maxCombo", 0);
        setIntField(term488545, term488545.getClass(), "totalCombo", 0);
        setIntField(term488545, term488545.getClass(), "maxSync", 0);
        setIntField(term488545, term488545.getClass(), "totalSync", 0);
        setIntField(term488545, term488545.getClass(), "tapCriticalPerfect", 0);
        setIntField(term488545, term488545.getClass(), "tapPerfect", 0);
        setIntField(term488545, term488545.getClass(), "tapGreat", 0);
        setIntField(term488545, term488545.getClass(), "tapGood", 0);
        setIntField(term488545, term488545.getClass(), "tapMiss", 0);
        setIntField(term488545, term488545.getClass(), "holdCriticalPerfect", 0);
        setIntField(term488545, term488545.getClass(), "holdPerfect", 0);
        setIntField(term488545, term488545.getClass(), "holdGreat", 0);
        setIntField(term488545, term488545.getClass(), "holdGood", 0);
        setIntField(term488545, term488545.getClass(), "holdMiss", 0);
        setIntField(term488545, term488545.getClass(), "slideCriticalPerfect", 0);
        setIntField(term488545, term488545.getClass(), "slidePerfect", 0);
        setIntField(term488545, term488545.getClass(), "slideGreat", 0);
        setIntField(term488545, term488545.getClass(), "slideGood", 0);
        setIntField(term488545, term488545.getClass(), "slideMiss", 0);
        setIntField(term488545, term488545.getClass(), "touchCriticalPerfect", 0);
        setIntField(term488545, term488545.getClass(), "touchPerfect", 0);
        setIntField(term488545, term488545.getClass(), "touchGreat", 0);
        setIntField(term488545, term488545.getClass(), "touchGood", 0);
        setIntField(term488545, term488545.getClass(), "touchMiss", 0);
        setIntField(term488545, term488545.getClass(), "breakCriticalPerfect", 0);
        setIntField(term488545, term488545.getClass(), "breakPerfect", 0);
        setIntField(term488545, term488545.getClass(), "breakGreat", 0);
        setIntField(term488545, term488545.getClass(), "breakGood", 0);
        setIntField(term488545, term488545.getClass(), "breakMiss", 0);
        setBooleanField(term488545, term488545.getClass(), "isTap", false);
        setBooleanField(term488545, term488545.getClass(), "isHold", false);
        setBooleanField(term488545, term488545.getClass(), "isSlide", false);
        setBooleanField(term488545, term488545.getClass(), "isTouch", false);
        setBooleanField(term488545, term488545.getClass(), "isBreak", false);
        setBooleanField(term488545, term488545.getClass(), "isCriticalDisp", false);
        setBooleanField(term488545, term488545.getClass(), "isFastLateDisp", false);
        setIntField(term488545, term488545.getClass(), "fastCount", 0);
        setIntField(term488545, term488545.getClass(), "lateCount", 0);
        setBooleanField(term488545, term488545.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term488545, term488545.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term488545, term488545.getClass(), "comboStatus", 0);
        setIntField(term488545, term488545.getClass(), "syncStatus", 0);
        setBooleanField(term488545, term488545.getClass(), "isClear", false);
        setIntField(term488545, term488545.getClass(), "beforeRating", 0);
        setIntField(term488545, term488545.getClass(), "afterRating", 0);
        setIntField(term488545, term488545.getClass(), "beforeGrade", 0);
        setIntField(term488545, term488545.getClass(), "afterGrade", 0);
        setIntField(term488545, term488545.getClass(), "afterGradeRank", 0);
        setIntField(term488545, term488545.getClass(), "beforeDeluxRating", 0);
        setIntField(term488545, term488545.getClass(), "afterDeluxRating", 0);
        setBooleanField(term488545, term488545.getClass(), "isPlayTutorial", false);
        setBooleanField(term488545, term488545.getClass(), "isEventMode", false);
        setBooleanField(term488545, term488545.getClass(), "isFreedomMode", false);
        setIntField(term488545, term488545.getClass(), "playMode", 0);
        setBooleanField(term488545, term488545.getClass(), "isNewFree", false);
        setIntField(term488545, term488545.getClass(), "trialPlayAchievement", 0);
        setIntField(term488545, term488545.getClass(), "extNum1", 0);
        setIntField(term488545, term488545.getClass(), "extNum2", 0);
        term488645 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term488645;
        callMethod(klass, "setVsUserGradeRank", argTypes, term488545, args);
    }

};


