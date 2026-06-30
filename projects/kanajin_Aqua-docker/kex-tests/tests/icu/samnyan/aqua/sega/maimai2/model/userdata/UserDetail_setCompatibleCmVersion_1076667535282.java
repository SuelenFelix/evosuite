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

public class UserDetail_setCompatibleCmVersion_1076667535282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292925;

    public UserDetail_setCompatibleCmVersion_1076667535282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292925 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292925, term292925.getClass(), "id", 0L);
        setField(term292925, term292925.getClass(), "card", null);
        setField(term292925, term292925.getClass(), "userName", null);
        setIntField(term292925, term292925.getClass(), "isNetMember", 0);
        setIntField(term292925, term292925.getClass(), "iconId", 0);
        setIntField(term292925, term292925.getClass(), "plateId", 0);
        setIntField(term292925, term292925.getClass(), "titleId", 0);
        setIntField(term292925, term292925.getClass(), "partnerId", 0);
        setIntField(term292925, term292925.getClass(), "frameId", 0);
        setIntField(term292925, term292925.getClass(), "selectMapId", 0);
        setIntField(term292925, term292925.getClass(), "totalAwake", 0);
        setIntField(term292925, term292925.getClass(), "gradeRating", 0);
        setIntField(term292925, term292925.getClass(), "musicRating", 0);
        setIntField(term292925, term292925.getClass(), "playerRating", 0);
        setIntField(term292925, term292925.getClass(), "highestRating", 0);
        setIntField(term292925, term292925.getClass(), "gradeRank", 0);
        setIntField(term292925, term292925.getClass(), "classRank", 0);
        setIntField(term292925, term292925.getClass(), "courseRank", 0);
        setField(term292925, term292925.getClass(), "charaSlot", null);
        setField(term292925, term292925.getClass(), "charaLockSlot", null);
        setLongField(term292925, term292925.getClass(), "contentBit", 0L);
        setIntField(term292925, term292925.getClass(), "playCount", 0);
        setField(term292925, term292925.getClass(), "eventWatchedDate", null);
        setField(term292925, term292925.getClass(), "lastGameId", null);
        setField(term292925, term292925.getClass(), "lastRomVersion", null);
        setField(term292925, term292925.getClass(), "lastDataVersion", null);
        setField(term292925, term292925.getClass(), "lastLoginDate", null);
        setField(term292925, term292925.getClass(), "lastPlayDate", null);
        setIntField(term292925, term292925.getClass(), "lastPlayCredit", 0);
        setIntField(term292925, term292925.getClass(), "lastPlayMode", 0);
        setIntField(term292925, term292925.getClass(), "lastPlaceId", 0);
        setField(term292925, term292925.getClass(), "lastPlaceName", null);
        setIntField(term292925, term292925.getClass(), "lastAllNetId", 0);
        setIntField(term292925, term292925.getClass(), "lastRegionId", 0);
        setField(term292925, term292925.getClass(), "lastRegionName", null);
        setField(term292925, term292925.getClass(), "lastClientId", null);
        setField(term292925, term292925.getClass(), "lastCountryCode", null);
        setIntField(term292925, term292925.getClass(), "lastSelectEMoney", 0);
        setIntField(term292925, term292925.getClass(), "lastSelectTicket", 0);
        setIntField(term292925, term292925.getClass(), "lastSelectCourse", 0);
        setIntField(term292925, term292925.getClass(), "lastCountCourse", 0);
        setField(term292925, term292925.getClass(), "firstGameId", null);
        setField(term292925, term292925.getClass(), "firstRomVersion", null);
        setField(term292925, term292925.getClass(), "firstDataVersion", null);
        setField(term292925, term292925.getClass(), "firstPlayDate", null);
        setField(term292925, term292925.getClass(), "compatibleCmVersion", null);
        setField(term292925, term292925.getClass(), "dailyBonusDate", null);
        setField(term292925, term292925.getClass(), "dailyCourseBonusDate", null);
        setField(term292925, term292925.getClass(), "lastPairLoginDate", null);
        setField(term292925, term292925.getClass(), "lastTrialPlayDate", null);
        setIntField(term292925, term292925.getClass(), "playVsCount", 0);
        setIntField(term292925, term292925.getClass(), "playSyncCount", 0);
        setIntField(term292925, term292925.getClass(), "winCount", 0);
        setIntField(term292925, term292925.getClass(), "helpCount", 0);
        setIntField(term292925, term292925.getClass(), "comboCount", 0);
        setLongField(term292925, term292925.getClass(), "totalDeluxscore", 0L);
        setLongField(term292925, term292925.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292925, term292925.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292925, term292925.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292925, term292925.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292925, term292925.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292925, term292925.getClass(), "totalSync", 0);
        setIntField(term292925, term292925.getClass(), "totalBasicSync", 0);
        setIntField(term292925, term292925.getClass(), "totalAdvancedSync", 0);
        setIntField(term292925, term292925.getClass(), "totalExpertSync", 0);
        setIntField(term292925, term292925.getClass(), "totalMasterSync", 0);
        setIntField(term292925, term292925.getClass(), "totalReMasterSync", 0);
        setLongField(term292925, term292925.getClass(), "totalAchievement", 0L);
        setLongField(term292925, term292925.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292925, term292925.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292925, term292925.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292925, term292925.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292925, term292925.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292925, term292925.getClass(), "playerOldRating", 0L);
        setLongField(term292925, term292925.getClass(), "playerNewRating", 0L);
        setIntField(term292925, term292925.getClass(), "banState", 0);
        setLongField(term292925, term292925.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCompatibleCmVersion", argTypes, term292925, args);
    }

};


