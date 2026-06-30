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

public class UserDetail_setLastSelectTicket_755918786275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292534;
     Object term292589;

    public UserDetail_setLastSelectTicket_755918786275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292534 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292534, term292534.getClass(), "id", 0L);
        setField(term292534, term292534.getClass(), "card", null);
        setField(term292534, term292534.getClass(), "userName", null);
        setIntField(term292534, term292534.getClass(), "isNetMember", 0);
        setIntField(term292534, term292534.getClass(), "iconId", 0);
        setIntField(term292534, term292534.getClass(), "plateId", 0);
        setIntField(term292534, term292534.getClass(), "titleId", 0);
        setIntField(term292534, term292534.getClass(), "partnerId", 0);
        setIntField(term292534, term292534.getClass(), "frameId", 0);
        setIntField(term292534, term292534.getClass(), "selectMapId", 0);
        setIntField(term292534, term292534.getClass(), "totalAwake", 0);
        setIntField(term292534, term292534.getClass(), "gradeRating", 0);
        setIntField(term292534, term292534.getClass(), "musicRating", 0);
        setIntField(term292534, term292534.getClass(), "playerRating", 0);
        setIntField(term292534, term292534.getClass(), "highestRating", 0);
        setIntField(term292534, term292534.getClass(), "gradeRank", 0);
        setIntField(term292534, term292534.getClass(), "classRank", 0);
        setIntField(term292534, term292534.getClass(), "courseRank", 0);
        setField(term292534, term292534.getClass(), "charaSlot", null);
        setField(term292534, term292534.getClass(), "charaLockSlot", null);
        setLongField(term292534, term292534.getClass(), "contentBit", 0L);
        setIntField(term292534, term292534.getClass(), "playCount", 0);
        setField(term292534, term292534.getClass(), "eventWatchedDate", null);
        setField(term292534, term292534.getClass(), "lastGameId", null);
        setField(term292534, term292534.getClass(), "lastRomVersion", null);
        setField(term292534, term292534.getClass(), "lastDataVersion", null);
        setField(term292534, term292534.getClass(), "lastLoginDate", null);
        setField(term292534, term292534.getClass(), "lastPlayDate", null);
        setIntField(term292534, term292534.getClass(), "lastPlayCredit", 0);
        setIntField(term292534, term292534.getClass(), "lastPlayMode", 0);
        setIntField(term292534, term292534.getClass(), "lastPlaceId", 0);
        setField(term292534, term292534.getClass(), "lastPlaceName", null);
        setIntField(term292534, term292534.getClass(), "lastAllNetId", 0);
        setIntField(term292534, term292534.getClass(), "lastRegionId", 0);
        setField(term292534, term292534.getClass(), "lastRegionName", null);
        setField(term292534, term292534.getClass(), "lastClientId", null);
        setField(term292534, term292534.getClass(), "lastCountryCode", null);
        setIntField(term292534, term292534.getClass(), "lastSelectEMoney", 0);
        setIntField(term292534, term292534.getClass(), "lastSelectTicket", 0);
        setIntField(term292534, term292534.getClass(), "lastSelectCourse", 0);
        setIntField(term292534, term292534.getClass(), "lastCountCourse", 0);
        setField(term292534, term292534.getClass(), "firstGameId", null);
        setField(term292534, term292534.getClass(), "firstRomVersion", null);
        setField(term292534, term292534.getClass(), "firstDataVersion", null);
        setField(term292534, term292534.getClass(), "firstPlayDate", null);
        setField(term292534, term292534.getClass(), "compatibleCmVersion", null);
        setField(term292534, term292534.getClass(), "dailyBonusDate", null);
        setField(term292534, term292534.getClass(), "dailyCourseBonusDate", null);
        setField(term292534, term292534.getClass(), "lastPairLoginDate", null);
        setField(term292534, term292534.getClass(), "lastTrialPlayDate", null);
        setIntField(term292534, term292534.getClass(), "playVsCount", 0);
        setIntField(term292534, term292534.getClass(), "playSyncCount", 0);
        setIntField(term292534, term292534.getClass(), "winCount", 0);
        setIntField(term292534, term292534.getClass(), "helpCount", 0);
        setIntField(term292534, term292534.getClass(), "comboCount", 0);
        setLongField(term292534, term292534.getClass(), "totalDeluxscore", 0L);
        setLongField(term292534, term292534.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292534, term292534.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292534, term292534.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292534, term292534.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292534, term292534.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292534, term292534.getClass(), "totalSync", 0);
        setIntField(term292534, term292534.getClass(), "totalBasicSync", 0);
        setIntField(term292534, term292534.getClass(), "totalAdvancedSync", 0);
        setIntField(term292534, term292534.getClass(), "totalExpertSync", 0);
        setIntField(term292534, term292534.getClass(), "totalMasterSync", 0);
        setIntField(term292534, term292534.getClass(), "totalReMasterSync", 0);
        setLongField(term292534, term292534.getClass(), "totalAchievement", 0L);
        setLongField(term292534, term292534.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292534, term292534.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292534, term292534.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292534, term292534.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292534, term292534.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292534, term292534.getClass(), "playerOldRating", 0L);
        setLongField(term292534, term292534.getClass(), "playerNewRating", 0L);
        setIntField(term292534, term292534.getClass(), "banState", 0);
        setLongField(term292534, term292534.getClass(), "dateTime", 0L);
        term292589 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292589;
        callMethod(klass, "setLastSelectTicket", argTypes, term292534, args);
    }

};


