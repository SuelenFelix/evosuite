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

public class UserDetail_setLastPlaceName_1189842157268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292143;

    public UserDetail_setLastPlaceName_1189842157268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292143 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292143, term292143.getClass(), "id", 0L);
        setField(term292143, term292143.getClass(), "card", null);
        setField(term292143, term292143.getClass(), "userName", null);
        setIntField(term292143, term292143.getClass(), "isNetMember", 0);
        setIntField(term292143, term292143.getClass(), "iconId", 0);
        setIntField(term292143, term292143.getClass(), "plateId", 0);
        setIntField(term292143, term292143.getClass(), "titleId", 0);
        setIntField(term292143, term292143.getClass(), "partnerId", 0);
        setIntField(term292143, term292143.getClass(), "frameId", 0);
        setIntField(term292143, term292143.getClass(), "selectMapId", 0);
        setIntField(term292143, term292143.getClass(), "totalAwake", 0);
        setIntField(term292143, term292143.getClass(), "gradeRating", 0);
        setIntField(term292143, term292143.getClass(), "musicRating", 0);
        setIntField(term292143, term292143.getClass(), "playerRating", 0);
        setIntField(term292143, term292143.getClass(), "highestRating", 0);
        setIntField(term292143, term292143.getClass(), "gradeRank", 0);
        setIntField(term292143, term292143.getClass(), "classRank", 0);
        setIntField(term292143, term292143.getClass(), "courseRank", 0);
        setField(term292143, term292143.getClass(), "charaSlot", null);
        setField(term292143, term292143.getClass(), "charaLockSlot", null);
        setLongField(term292143, term292143.getClass(), "contentBit", 0L);
        setIntField(term292143, term292143.getClass(), "playCount", 0);
        setField(term292143, term292143.getClass(), "eventWatchedDate", null);
        setField(term292143, term292143.getClass(), "lastGameId", null);
        setField(term292143, term292143.getClass(), "lastRomVersion", null);
        setField(term292143, term292143.getClass(), "lastDataVersion", null);
        setField(term292143, term292143.getClass(), "lastLoginDate", null);
        setField(term292143, term292143.getClass(), "lastPlayDate", null);
        setIntField(term292143, term292143.getClass(), "lastPlayCredit", 0);
        setIntField(term292143, term292143.getClass(), "lastPlayMode", 0);
        setIntField(term292143, term292143.getClass(), "lastPlaceId", 0);
        setField(term292143, term292143.getClass(), "lastPlaceName", null);
        setIntField(term292143, term292143.getClass(), "lastAllNetId", 0);
        setIntField(term292143, term292143.getClass(), "lastRegionId", 0);
        setField(term292143, term292143.getClass(), "lastRegionName", null);
        setField(term292143, term292143.getClass(), "lastClientId", null);
        setField(term292143, term292143.getClass(), "lastCountryCode", null);
        setIntField(term292143, term292143.getClass(), "lastSelectEMoney", 0);
        setIntField(term292143, term292143.getClass(), "lastSelectTicket", 0);
        setIntField(term292143, term292143.getClass(), "lastSelectCourse", 0);
        setIntField(term292143, term292143.getClass(), "lastCountCourse", 0);
        setField(term292143, term292143.getClass(), "firstGameId", null);
        setField(term292143, term292143.getClass(), "firstRomVersion", null);
        setField(term292143, term292143.getClass(), "firstDataVersion", null);
        setField(term292143, term292143.getClass(), "firstPlayDate", null);
        setField(term292143, term292143.getClass(), "compatibleCmVersion", null);
        setField(term292143, term292143.getClass(), "dailyBonusDate", null);
        setField(term292143, term292143.getClass(), "dailyCourseBonusDate", null);
        setField(term292143, term292143.getClass(), "lastPairLoginDate", null);
        setField(term292143, term292143.getClass(), "lastTrialPlayDate", null);
        setIntField(term292143, term292143.getClass(), "playVsCount", 0);
        setIntField(term292143, term292143.getClass(), "playSyncCount", 0);
        setIntField(term292143, term292143.getClass(), "winCount", 0);
        setIntField(term292143, term292143.getClass(), "helpCount", 0);
        setIntField(term292143, term292143.getClass(), "comboCount", 0);
        setLongField(term292143, term292143.getClass(), "totalDeluxscore", 0L);
        setLongField(term292143, term292143.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292143, term292143.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292143, term292143.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292143, term292143.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292143, term292143.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292143, term292143.getClass(), "totalSync", 0);
        setIntField(term292143, term292143.getClass(), "totalBasicSync", 0);
        setIntField(term292143, term292143.getClass(), "totalAdvancedSync", 0);
        setIntField(term292143, term292143.getClass(), "totalExpertSync", 0);
        setIntField(term292143, term292143.getClass(), "totalMasterSync", 0);
        setIntField(term292143, term292143.getClass(), "totalReMasterSync", 0);
        setLongField(term292143, term292143.getClass(), "totalAchievement", 0L);
        setLongField(term292143, term292143.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292143, term292143.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292143, term292143.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292143, term292143.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292143, term292143.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292143, term292143.getClass(), "playerOldRating", 0L);
        setLongField(term292143, term292143.getClass(), "playerNewRating", 0L);
        setIntField(term292143, term292143.getClass(), "banState", 0);
        setLongField(term292143, term292143.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlaceName", argTypes, term292143, args);
    }

};


