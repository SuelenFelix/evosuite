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

public class UserDetail_setLastRegionId_2053501573270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292255;
     Object term292310;

    public UserDetail_setLastRegionId_2053501573270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292255 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292255, term292255.getClass(), "id", 0L);
        setField(term292255, term292255.getClass(), "card", null);
        setField(term292255, term292255.getClass(), "userName", null);
        setIntField(term292255, term292255.getClass(), "isNetMember", 0);
        setIntField(term292255, term292255.getClass(), "iconId", 0);
        setIntField(term292255, term292255.getClass(), "plateId", 0);
        setIntField(term292255, term292255.getClass(), "titleId", 0);
        setIntField(term292255, term292255.getClass(), "partnerId", 0);
        setIntField(term292255, term292255.getClass(), "frameId", 0);
        setIntField(term292255, term292255.getClass(), "selectMapId", 0);
        setIntField(term292255, term292255.getClass(), "totalAwake", 0);
        setIntField(term292255, term292255.getClass(), "gradeRating", 0);
        setIntField(term292255, term292255.getClass(), "musicRating", 0);
        setIntField(term292255, term292255.getClass(), "playerRating", 0);
        setIntField(term292255, term292255.getClass(), "highestRating", 0);
        setIntField(term292255, term292255.getClass(), "gradeRank", 0);
        setIntField(term292255, term292255.getClass(), "classRank", 0);
        setIntField(term292255, term292255.getClass(), "courseRank", 0);
        setField(term292255, term292255.getClass(), "charaSlot", null);
        setField(term292255, term292255.getClass(), "charaLockSlot", null);
        setLongField(term292255, term292255.getClass(), "contentBit", 0L);
        setIntField(term292255, term292255.getClass(), "playCount", 0);
        setField(term292255, term292255.getClass(), "eventWatchedDate", null);
        setField(term292255, term292255.getClass(), "lastGameId", null);
        setField(term292255, term292255.getClass(), "lastRomVersion", null);
        setField(term292255, term292255.getClass(), "lastDataVersion", null);
        setField(term292255, term292255.getClass(), "lastLoginDate", null);
        setField(term292255, term292255.getClass(), "lastPlayDate", null);
        setIntField(term292255, term292255.getClass(), "lastPlayCredit", 0);
        setIntField(term292255, term292255.getClass(), "lastPlayMode", 0);
        setIntField(term292255, term292255.getClass(), "lastPlaceId", 0);
        setField(term292255, term292255.getClass(), "lastPlaceName", null);
        setIntField(term292255, term292255.getClass(), "lastAllNetId", 0);
        setIntField(term292255, term292255.getClass(), "lastRegionId", 0);
        setField(term292255, term292255.getClass(), "lastRegionName", null);
        setField(term292255, term292255.getClass(), "lastClientId", null);
        setField(term292255, term292255.getClass(), "lastCountryCode", null);
        setIntField(term292255, term292255.getClass(), "lastSelectEMoney", 0);
        setIntField(term292255, term292255.getClass(), "lastSelectTicket", 0);
        setIntField(term292255, term292255.getClass(), "lastSelectCourse", 0);
        setIntField(term292255, term292255.getClass(), "lastCountCourse", 0);
        setField(term292255, term292255.getClass(), "firstGameId", null);
        setField(term292255, term292255.getClass(), "firstRomVersion", null);
        setField(term292255, term292255.getClass(), "firstDataVersion", null);
        setField(term292255, term292255.getClass(), "firstPlayDate", null);
        setField(term292255, term292255.getClass(), "compatibleCmVersion", null);
        setField(term292255, term292255.getClass(), "dailyBonusDate", null);
        setField(term292255, term292255.getClass(), "dailyCourseBonusDate", null);
        setField(term292255, term292255.getClass(), "lastPairLoginDate", null);
        setField(term292255, term292255.getClass(), "lastTrialPlayDate", null);
        setIntField(term292255, term292255.getClass(), "playVsCount", 0);
        setIntField(term292255, term292255.getClass(), "playSyncCount", 0);
        setIntField(term292255, term292255.getClass(), "winCount", 0);
        setIntField(term292255, term292255.getClass(), "helpCount", 0);
        setIntField(term292255, term292255.getClass(), "comboCount", 0);
        setLongField(term292255, term292255.getClass(), "totalDeluxscore", 0L);
        setLongField(term292255, term292255.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292255, term292255.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292255, term292255.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292255, term292255.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292255, term292255.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292255, term292255.getClass(), "totalSync", 0);
        setIntField(term292255, term292255.getClass(), "totalBasicSync", 0);
        setIntField(term292255, term292255.getClass(), "totalAdvancedSync", 0);
        setIntField(term292255, term292255.getClass(), "totalExpertSync", 0);
        setIntField(term292255, term292255.getClass(), "totalMasterSync", 0);
        setIntField(term292255, term292255.getClass(), "totalReMasterSync", 0);
        setLongField(term292255, term292255.getClass(), "totalAchievement", 0L);
        setLongField(term292255, term292255.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292255, term292255.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292255, term292255.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292255, term292255.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292255, term292255.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292255, term292255.getClass(), "playerOldRating", 0L);
        setLongField(term292255, term292255.getClass(), "playerNewRating", 0L);
        setIntField(term292255, term292255.getClass(), "banState", 0);
        setLongField(term292255, term292255.getClass(), "dateTime", 0L);
        term292310 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292310;
        callMethod(klass, "setLastRegionId", argTypes, term292255, args);
    }

};


