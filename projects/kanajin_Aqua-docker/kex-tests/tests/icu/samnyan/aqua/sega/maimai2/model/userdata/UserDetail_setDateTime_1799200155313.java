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
import java.lang.Long;

public class UserDetail_setDateTime_1799200155313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294682;
     Object term294737;

    public UserDetail_setDateTime_1799200155313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294682 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294682, term294682.getClass(), "id", 0L);
        setField(term294682, term294682.getClass(), "card", null);
        setField(term294682, term294682.getClass(), "userName", null);
        setIntField(term294682, term294682.getClass(), "isNetMember", 0);
        setIntField(term294682, term294682.getClass(), "iconId", 0);
        setIntField(term294682, term294682.getClass(), "plateId", 0);
        setIntField(term294682, term294682.getClass(), "titleId", 0);
        setIntField(term294682, term294682.getClass(), "partnerId", 0);
        setIntField(term294682, term294682.getClass(), "frameId", 0);
        setIntField(term294682, term294682.getClass(), "selectMapId", 0);
        setIntField(term294682, term294682.getClass(), "totalAwake", 0);
        setIntField(term294682, term294682.getClass(), "gradeRating", 0);
        setIntField(term294682, term294682.getClass(), "musicRating", 0);
        setIntField(term294682, term294682.getClass(), "playerRating", 0);
        setIntField(term294682, term294682.getClass(), "highestRating", 0);
        setIntField(term294682, term294682.getClass(), "gradeRank", 0);
        setIntField(term294682, term294682.getClass(), "classRank", 0);
        setIntField(term294682, term294682.getClass(), "courseRank", 0);
        setField(term294682, term294682.getClass(), "charaSlot", null);
        setField(term294682, term294682.getClass(), "charaLockSlot", null);
        setLongField(term294682, term294682.getClass(), "contentBit", 0L);
        setIntField(term294682, term294682.getClass(), "playCount", 0);
        setField(term294682, term294682.getClass(), "eventWatchedDate", null);
        setField(term294682, term294682.getClass(), "lastGameId", null);
        setField(term294682, term294682.getClass(), "lastRomVersion", null);
        setField(term294682, term294682.getClass(), "lastDataVersion", null);
        setField(term294682, term294682.getClass(), "lastLoginDate", null);
        setField(term294682, term294682.getClass(), "lastPlayDate", null);
        setIntField(term294682, term294682.getClass(), "lastPlayCredit", 0);
        setIntField(term294682, term294682.getClass(), "lastPlayMode", 0);
        setIntField(term294682, term294682.getClass(), "lastPlaceId", 0);
        setField(term294682, term294682.getClass(), "lastPlaceName", null);
        setIntField(term294682, term294682.getClass(), "lastAllNetId", 0);
        setIntField(term294682, term294682.getClass(), "lastRegionId", 0);
        setField(term294682, term294682.getClass(), "lastRegionName", null);
        setField(term294682, term294682.getClass(), "lastClientId", null);
        setField(term294682, term294682.getClass(), "lastCountryCode", null);
        setIntField(term294682, term294682.getClass(), "lastSelectEMoney", 0);
        setIntField(term294682, term294682.getClass(), "lastSelectTicket", 0);
        setIntField(term294682, term294682.getClass(), "lastSelectCourse", 0);
        setIntField(term294682, term294682.getClass(), "lastCountCourse", 0);
        setField(term294682, term294682.getClass(), "firstGameId", null);
        setField(term294682, term294682.getClass(), "firstRomVersion", null);
        setField(term294682, term294682.getClass(), "firstDataVersion", null);
        setField(term294682, term294682.getClass(), "firstPlayDate", null);
        setField(term294682, term294682.getClass(), "compatibleCmVersion", null);
        setField(term294682, term294682.getClass(), "dailyBonusDate", null);
        setField(term294682, term294682.getClass(), "dailyCourseBonusDate", null);
        setField(term294682, term294682.getClass(), "lastPairLoginDate", null);
        setField(term294682, term294682.getClass(), "lastTrialPlayDate", null);
        setIntField(term294682, term294682.getClass(), "playVsCount", 0);
        setIntField(term294682, term294682.getClass(), "playSyncCount", 0);
        setIntField(term294682, term294682.getClass(), "winCount", 0);
        setIntField(term294682, term294682.getClass(), "helpCount", 0);
        setIntField(term294682, term294682.getClass(), "comboCount", 0);
        setLongField(term294682, term294682.getClass(), "totalDeluxscore", 0L);
        setLongField(term294682, term294682.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294682, term294682.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294682, term294682.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294682, term294682.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294682, term294682.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294682, term294682.getClass(), "totalSync", 0);
        setIntField(term294682, term294682.getClass(), "totalBasicSync", 0);
        setIntField(term294682, term294682.getClass(), "totalAdvancedSync", 0);
        setIntField(term294682, term294682.getClass(), "totalExpertSync", 0);
        setIntField(term294682, term294682.getClass(), "totalMasterSync", 0);
        setIntField(term294682, term294682.getClass(), "totalReMasterSync", 0);
        setLongField(term294682, term294682.getClass(), "totalAchievement", 0L);
        setLongField(term294682, term294682.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294682, term294682.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294682, term294682.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294682, term294682.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294682, term294682.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294682, term294682.getClass(), "playerOldRating", 0L);
        setLongField(term294682, term294682.getClass(), "playerNewRating", 0L);
        setIntField(term294682, term294682.getClass(), "banState", 0);
        setLongField(term294682, term294682.getClass(), "dateTime", 0L);
        term294737 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term294737;
        callMethod(klass, "setDateTime", argTypes, term294682, args);
    }

};


