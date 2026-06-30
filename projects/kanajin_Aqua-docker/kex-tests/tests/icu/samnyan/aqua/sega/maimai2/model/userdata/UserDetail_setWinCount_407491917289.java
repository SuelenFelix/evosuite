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

public class UserDetail_setWinCount_407491917289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293314;
     Object term293369;

    public UserDetail_setWinCount_407491917289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293314 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293314, term293314.getClass(), "id", 0L);
        setField(term293314, term293314.getClass(), "card", null);
        setField(term293314, term293314.getClass(), "userName", null);
        setIntField(term293314, term293314.getClass(), "isNetMember", 0);
        setIntField(term293314, term293314.getClass(), "iconId", 0);
        setIntField(term293314, term293314.getClass(), "plateId", 0);
        setIntField(term293314, term293314.getClass(), "titleId", 0);
        setIntField(term293314, term293314.getClass(), "partnerId", 0);
        setIntField(term293314, term293314.getClass(), "frameId", 0);
        setIntField(term293314, term293314.getClass(), "selectMapId", 0);
        setIntField(term293314, term293314.getClass(), "totalAwake", 0);
        setIntField(term293314, term293314.getClass(), "gradeRating", 0);
        setIntField(term293314, term293314.getClass(), "musicRating", 0);
        setIntField(term293314, term293314.getClass(), "playerRating", 0);
        setIntField(term293314, term293314.getClass(), "highestRating", 0);
        setIntField(term293314, term293314.getClass(), "gradeRank", 0);
        setIntField(term293314, term293314.getClass(), "classRank", 0);
        setIntField(term293314, term293314.getClass(), "courseRank", 0);
        setField(term293314, term293314.getClass(), "charaSlot", null);
        setField(term293314, term293314.getClass(), "charaLockSlot", null);
        setLongField(term293314, term293314.getClass(), "contentBit", 0L);
        setIntField(term293314, term293314.getClass(), "playCount", 0);
        setField(term293314, term293314.getClass(), "eventWatchedDate", null);
        setField(term293314, term293314.getClass(), "lastGameId", null);
        setField(term293314, term293314.getClass(), "lastRomVersion", null);
        setField(term293314, term293314.getClass(), "lastDataVersion", null);
        setField(term293314, term293314.getClass(), "lastLoginDate", null);
        setField(term293314, term293314.getClass(), "lastPlayDate", null);
        setIntField(term293314, term293314.getClass(), "lastPlayCredit", 0);
        setIntField(term293314, term293314.getClass(), "lastPlayMode", 0);
        setIntField(term293314, term293314.getClass(), "lastPlaceId", 0);
        setField(term293314, term293314.getClass(), "lastPlaceName", null);
        setIntField(term293314, term293314.getClass(), "lastAllNetId", 0);
        setIntField(term293314, term293314.getClass(), "lastRegionId", 0);
        setField(term293314, term293314.getClass(), "lastRegionName", null);
        setField(term293314, term293314.getClass(), "lastClientId", null);
        setField(term293314, term293314.getClass(), "lastCountryCode", null);
        setIntField(term293314, term293314.getClass(), "lastSelectEMoney", 0);
        setIntField(term293314, term293314.getClass(), "lastSelectTicket", 0);
        setIntField(term293314, term293314.getClass(), "lastSelectCourse", 0);
        setIntField(term293314, term293314.getClass(), "lastCountCourse", 0);
        setField(term293314, term293314.getClass(), "firstGameId", null);
        setField(term293314, term293314.getClass(), "firstRomVersion", null);
        setField(term293314, term293314.getClass(), "firstDataVersion", null);
        setField(term293314, term293314.getClass(), "firstPlayDate", null);
        setField(term293314, term293314.getClass(), "compatibleCmVersion", null);
        setField(term293314, term293314.getClass(), "dailyBonusDate", null);
        setField(term293314, term293314.getClass(), "dailyCourseBonusDate", null);
        setField(term293314, term293314.getClass(), "lastPairLoginDate", null);
        setField(term293314, term293314.getClass(), "lastTrialPlayDate", null);
        setIntField(term293314, term293314.getClass(), "playVsCount", 0);
        setIntField(term293314, term293314.getClass(), "playSyncCount", 0);
        setIntField(term293314, term293314.getClass(), "winCount", 0);
        setIntField(term293314, term293314.getClass(), "helpCount", 0);
        setIntField(term293314, term293314.getClass(), "comboCount", 0);
        setLongField(term293314, term293314.getClass(), "totalDeluxscore", 0L);
        setLongField(term293314, term293314.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293314, term293314.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293314, term293314.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293314, term293314.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293314, term293314.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293314, term293314.getClass(), "totalSync", 0);
        setIntField(term293314, term293314.getClass(), "totalBasicSync", 0);
        setIntField(term293314, term293314.getClass(), "totalAdvancedSync", 0);
        setIntField(term293314, term293314.getClass(), "totalExpertSync", 0);
        setIntField(term293314, term293314.getClass(), "totalMasterSync", 0);
        setIntField(term293314, term293314.getClass(), "totalReMasterSync", 0);
        setLongField(term293314, term293314.getClass(), "totalAchievement", 0L);
        setLongField(term293314, term293314.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293314, term293314.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293314, term293314.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293314, term293314.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293314, term293314.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293314, term293314.getClass(), "playerOldRating", 0L);
        setLongField(term293314, term293314.getClass(), "playerNewRating", 0L);
        setIntField(term293314, term293314.getClass(), "banState", 0);
        setLongField(term293314, term293314.getClass(), "dateTime", 0L);
        term293369 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293369;
        callMethod(klass, "setWinCount", argTypes, term293314, args);
    }

};


