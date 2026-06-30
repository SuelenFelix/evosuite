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

public class UserDetail_setLastRegionName_814913872271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292312;

    public UserDetail_setLastRegionName_814913872271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292312 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292312, term292312.getClass(), "id", 0L);
        setField(term292312, term292312.getClass(), "card", null);
        setField(term292312, term292312.getClass(), "userName", null);
        setIntField(term292312, term292312.getClass(), "isNetMember", 0);
        setIntField(term292312, term292312.getClass(), "iconId", 0);
        setIntField(term292312, term292312.getClass(), "plateId", 0);
        setIntField(term292312, term292312.getClass(), "titleId", 0);
        setIntField(term292312, term292312.getClass(), "partnerId", 0);
        setIntField(term292312, term292312.getClass(), "frameId", 0);
        setIntField(term292312, term292312.getClass(), "selectMapId", 0);
        setIntField(term292312, term292312.getClass(), "totalAwake", 0);
        setIntField(term292312, term292312.getClass(), "gradeRating", 0);
        setIntField(term292312, term292312.getClass(), "musicRating", 0);
        setIntField(term292312, term292312.getClass(), "playerRating", 0);
        setIntField(term292312, term292312.getClass(), "highestRating", 0);
        setIntField(term292312, term292312.getClass(), "gradeRank", 0);
        setIntField(term292312, term292312.getClass(), "classRank", 0);
        setIntField(term292312, term292312.getClass(), "courseRank", 0);
        setField(term292312, term292312.getClass(), "charaSlot", null);
        setField(term292312, term292312.getClass(), "charaLockSlot", null);
        setLongField(term292312, term292312.getClass(), "contentBit", 0L);
        setIntField(term292312, term292312.getClass(), "playCount", 0);
        setField(term292312, term292312.getClass(), "eventWatchedDate", null);
        setField(term292312, term292312.getClass(), "lastGameId", null);
        setField(term292312, term292312.getClass(), "lastRomVersion", null);
        setField(term292312, term292312.getClass(), "lastDataVersion", null);
        setField(term292312, term292312.getClass(), "lastLoginDate", null);
        setField(term292312, term292312.getClass(), "lastPlayDate", null);
        setIntField(term292312, term292312.getClass(), "lastPlayCredit", 0);
        setIntField(term292312, term292312.getClass(), "lastPlayMode", 0);
        setIntField(term292312, term292312.getClass(), "lastPlaceId", 0);
        setField(term292312, term292312.getClass(), "lastPlaceName", null);
        setIntField(term292312, term292312.getClass(), "lastAllNetId", 0);
        setIntField(term292312, term292312.getClass(), "lastRegionId", 0);
        setField(term292312, term292312.getClass(), "lastRegionName", null);
        setField(term292312, term292312.getClass(), "lastClientId", null);
        setField(term292312, term292312.getClass(), "lastCountryCode", null);
        setIntField(term292312, term292312.getClass(), "lastSelectEMoney", 0);
        setIntField(term292312, term292312.getClass(), "lastSelectTicket", 0);
        setIntField(term292312, term292312.getClass(), "lastSelectCourse", 0);
        setIntField(term292312, term292312.getClass(), "lastCountCourse", 0);
        setField(term292312, term292312.getClass(), "firstGameId", null);
        setField(term292312, term292312.getClass(), "firstRomVersion", null);
        setField(term292312, term292312.getClass(), "firstDataVersion", null);
        setField(term292312, term292312.getClass(), "firstPlayDate", null);
        setField(term292312, term292312.getClass(), "compatibleCmVersion", null);
        setField(term292312, term292312.getClass(), "dailyBonusDate", null);
        setField(term292312, term292312.getClass(), "dailyCourseBonusDate", null);
        setField(term292312, term292312.getClass(), "lastPairLoginDate", null);
        setField(term292312, term292312.getClass(), "lastTrialPlayDate", null);
        setIntField(term292312, term292312.getClass(), "playVsCount", 0);
        setIntField(term292312, term292312.getClass(), "playSyncCount", 0);
        setIntField(term292312, term292312.getClass(), "winCount", 0);
        setIntField(term292312, term292312.getClass(), "helpCount", 0);
        setIntField(term292312, term292312.getClass(), "comboCount", 0);
        setLongField(term292312, term292312.getClass(), "totalDeluxscore", 0L);
        setLongField(term292312, term292312.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292312, term292312.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292312, term292312.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292312, term292312.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292312, term292312.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292312, term292312.getClass(), "totalSync", 0);
        setIntField(term292312, term292312.getClass(), "totalBasicSync", 0);
        setIntField(term292312, term292312.getClass(), "totalAdvancedSync", 0);
        setIntField(term292312, term292312.getClass(), "totalExpertSync", 0);
        setIntField(term292312, term292312.getClass(), "totalMasterSync", 0);
        setIntField(term292312, term292312.getClass(), "totalReMasterSync", 0);
        setLongField(term292312, term292312.getClass(), "totalAchievement", 0L);
        setLongField(term292312, term292312.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292312, term292312.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292312, term292312.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292312, term292312.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292312, term292312.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292312, term292312.getClass(), "playerOldRating", 0L);
        setLongField(term292312, term292312.getClass(), "playerNewRating", 0L);
        setIntField(term292312, term292312.getClass(), "banState", 0);
        setLongField(term292312, term292312.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastRegionName", argTypes, term292312, args);
    }

};


