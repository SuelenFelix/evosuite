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

public class UserPlaylog_setSlideMiss_322385834394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493435;
     Object term493535;

    public UserPlaylog_setSlideMiss_322385834394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493435 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog"));
        setLongField(term493435, term493435.getClass(), "id", 0L);
        setField(term493435, term493435.getClass(), "user", null);
        setIntField(term493435, term493435.getClass(), "orderId", 0);
        setLongField(term493435, term493435.getClass(), "playlogId", 0L);
        setIntField(term493435, term493435.getClass(), "version", 0);
        setIntField(term493435, term493435.getClass(), "placeId", 0);
        setField(term493435, term493435.getClass(), "placeName", null);
        setLongField(term493435, term493435.getClass(), "loginDate", 0L);
        setField(term493435, term493435.getClass(), "playDate", null);
        setField(term493435, term493435.getClass(), "userPlayDate", null);
        setIntField(term493435, term493435.getClass(), "type", 0);
        setIntField(term493435, term493435.getClass(), "musicId", 0);
        setIntField(term493435, term493435.getClass(), "level", 0);
        setIntField(term493435, term493435.getClass(), "trackNo", 0);
        setIntField(term493435, term493435.getClass(), "vsMode", 0);
        setField(term493435, term493435.getClass(), "vsUserName", null);
        setIntField(term493435, term493435.getClass(), "vsStatus", 0);
        setIntField(term493435, term493435.getClass(), "vsUserRating", 0);
        setIntField(term493435, term493435.getClass(), "vsUserAchievement", 0);
        setIntField(term493435, term493435.getClass(), "vsUserGradeRank", 0);
        setIntField(term493435, term493435.getClass(), "vsRank", 0);
        setIntField(term493435, term493435.getClass(), "playerNum", 0);
        setLongField(term493435, term493435.getClass(), "playedUserId1", 0L);
        setField(term493435, term493435.getClass(), "playedUserName1", null);
        setIntField(term493435, term493435.getClass(), "playedMusicLevel1", 0);
        setLongField(term493435, term493435.getClass(), "playedUserId2", 0L);
        setField(term493435, term493435.getClass(), "playedUserName2", null);
        setIntField(term493435, term493435.getClass(), "playedMusicLevel2", 0);
        setLongField(term493435, term493435.getClass(), "playedUserId3", 0L);
        setField(term493435, term493435.getClass(), "playedUserName3", null);
        setIntField(term493435, term493435.getClass(), "playedMusicLevel3", 0);
        setIntField(term493435, term493435.getClass(), "characterId1", 0);
        setIntField(term493435, term493435.getClass(), "characterLevel1", 0);
        setIntField(term493435, term493435.getClass(), "characterAwakening1", 0);
        setIntField(term493435, term493435.getClass(), "characterId2", 0);
        setIntField(term493435, term493435.getClass(), "characterLevel2", 0);
        setIntField(term493435, term493435.getClass(), "characterAwakening2", 0);
        setIntField(term493435, term493435.getClass(), "characterId3", 0);
        setIntField(term493435, term493435.getClass(), "characterLevel3", 0);
        setIntField(term493435, term493435.getClass(), "characterAwakening3", 0);
        setIntField(term493435, term493435.getClass(), "characterId4", 0);
        setIntField(term493435, term493435.getClass(), "characterLevel4", 0);
        setIntField(term493435, term493435.getClass(), "characterAwakening4", 0);
        setIntField(term493435, term493435.getClass(), "characterId5", 0);
        setIntField(term493435, term493435.getClass(), "characterLevel5", 0);
        setIntField(term493435, term493435.getClass(), "characterAwakening5", 0);
        setIntField(term493435, term493435.getClass(), "achievement", 0);
        setIntField(term493435, term493435.getClass(), "deluxscore", 0);
        setIntField(term493435, term493435.getClass(), "scoreRank", 0);
        setIntField(term493435, term493435.getClass(), "maxCombo", 0);
        setIntField(term493435, term493435.getClass(), "totalCombo", 0);
        setIntField(term493435, term493435.getClass(), "maxSync", 0);
        setIntField(term493435, term493435.getClass(), "totalSync", 0);
        setIntField(term493435, term493435.getClass(), "tapCriticalPerfect", 0);
        setIntField(term493435, term493435.getClass(), "tapPerfect", 0);
        setIntField(term493435, term493435.getClass(), "tapGreat", 0);
        setIntField(term493435, term493435.getClass(), "tapGood", 0);
        setIntField(term493435, term493435.getClass(), "tapMiss", 0);
        setIntField(term493435, term493435.getClass(), "holdCriticalPerfect", 0);
        setIntField(term493435, term493435.getClass(), "holdPerfect", 0);
        setIntField(term493435, term493435.getClass(), "holdGreat", 0);
        setIntField(term493435, term493435.getClass(), "holdGood", 0);
        setIntField(term493435, term493435.getClass(), "holdMiss", 0);
        setIntField(term493435, term493435.getClass(), "slideCriticalPerfect", 0);
        setIntField(term493435, term493435.getClass(), "slidePerfect", 0);
        setIntField(term493435, term493435.getClass(), "slideGreat", 0);
        setIntField(term493435, term493435.getClass(), "slideGood", 0);
        setIntField(term493435, term493435.getClass(), "slideMiss", 0);
        setIntField(term493435, term493435.getClass(), "touchCriticalPerfect", 0);
        setIntField(term493435, term493435.getClass(), "touchPerfect", 0);
        setIntField(term493435, term493435.getClass(), "touchGreat", 0);
        setIntField(term493435, term493435.getClass(), "touchGood", 0);
        setIntField(term493435, term493435.getClass(), "touchMiss", 0);
        setIntField(term493435, term493435.getClass(), "breakCriticalPerfect", 0);
        setIntField(term493435, term493435.getClass(), "breakPerfect", 0);
        setIntField(term493435, term493435.getClass(), "breakGreat", 0);
        setIntField(term493435, term493435.getClass(), "breakGood", 0);
        setIntField(term493435, term493435.getClass(), "breakMiss", 0);
        setBooleanField(term493435, term493435.getClass(), "isTap", false);
        setBooleanField(term493435, term493435.getClass(), "isHold", false);
        setBooleanField(term493435, term493435.getClass(), "isSlide", false);
        setBooleanField(term493435, term493435.getClass(), "isTouch", false);
        setBooleanField(term493435, term493435.getClass(), "isBreak", false);
        setBooleanField(term493435, term493435.getClass(), "isCriticalDisp", false);
        setBooleanField(term493435, term493435.getClass(), "isFastLateDisp", false);
        setIntField(term493435, term493435.getClass(), "fastCount", 0);
        setIntField(term493435, term493435.getClass(), "lateCount", 0);
        setBooleanField(term493435, term493435.getClass(), "isAchieveNewRecord", false);
        setBooleanField(term493435, term493435.getClass(), "isDeluxscoreNewRecord", false);
        setIntField(term493435, term493435.getClass(), "comboStatus", 0);
        setIntField(term493435, term493435.getClass(), "syncStatus", 0);
        setBooleanField(term493435, term493435.getClass(), "isClear", false);
        setIntField(term493435, term493435.getClass(), "beforeRating", 0);
        setIntField(term493435, term493435.getClass(), "afterRating", 0);
        setIntField(term493435, term493435.getClass(), "beforeGrade", 0);
        setIntField(term493435, term493435.getClass(), "afterGrade", 0);
        setIntField(term493435, term493435.getClass(), "afterGradeRank", 0);
        setIntField(term493435, term493435.getClass(), "beforeDeluxRating", 0);
        setIntField(term493435, term493435.getClass(), "afterDeluxRating", 0);
        setBooleanField(term493435, term493435.getClass(), "isPlayTutorial", false);
        setBooleanField(term493435, term493435.getClass(), "isEventMode", false);
        setBooleanField(term493435, term493435.getClass(), "isFreedomMode", false);
        setIntField(term493435, term493435.getClass(), "playMode", 0);
        setBooleanField(term493435, term493435.getClass(), "isNewFree", false);
        setIntField(term493435, term493435.getClass(), "trialPlayAchievement", 0);
        setIntField(term493435, term493435.getClass(), "extNum1", 0);
        setIntField(term493435, term493435.getClass(), "extNum2", 0);
        term493535 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term493535;
        callMethod(klass, "setSlideMiss", argTypes, term493435, args);
    }

};


