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

public class UserDetail_setTotalMasterDeluxscore_321222726296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293713;
     Object term293768;

    public UserDetail_setTotalMasterDeluxscore_321222726296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293713 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293713, term293713.getClass(), "id", 0L);
        setField(term293713, term293713.getClass(), "card", null);
        setField(term293713, term293713.getClass(), "userName", null);
        setIntField(term293713, term293713.getClass(), "isNetMember", 0);
        setIntField(term293713, term293713.getClass(), "iconId", 0);
        setIntField(term293713, term293713.getClass(), "plateId", 0);
        setIntField(term293713, term293713.getClass(), "titleId", 0);
        setIntField(term293713, term293713.getClass(), "partnerId", 0);
        setIntField(term293713, term293713.getClass(), "frameId", 0);
        setIntField(term293713, term293713.getClass(), "selectMapId", 0);
        setIntField(term293713, term293713.getClass(), "totalAwake", 0);
        setIntField(term293713, term293713.getClass(), "gradeRating", 0);
        setIntField(term293713, term293713.getClass(), "musicRating", 0);
        setIntField(term293713, term293713.getClass(), "playerRating", 0);
        setIntField(term293713, term293713.getClass(), "highestRating", 0);
        setIntField(term293713, term293713.getClass(), "gradeRank", 0);
        setIntField(term293713, term293713.getClass(), "classRank", 0);
        setIntField(term293713, term293713.getClass(), "courseRank", 0);
        setField(term293713, term293713.getClass(), "charaSlot", null);
        setField(term293713, term293713.getClass(), "charaLockSlot", null);
        setLongField(term293713, term293713.getClass(), "contentBit", 0L);
        setIntField(term293713, term293713.getClass(), "playCount", 0);
        setField(term293713, term293713.getClass(), "eventWatchedDate", null);
        setField(term293713, term293713.getClass(), "lastGameId", null);
        setField(term293713, term293713.getClass(), "lastRomVersion", null);
        setField(term293713, term293713.getClass(), "lastDataVersion", null);
        setField(term293713, term293713.getClass(), "lastLoginDate", null);
        setField(term293713, term293713.getClass(), "lastPlayDate", null);
        setIntField(term293713, term293713.getClass(), "lastPlayCredit", 0);
        setIntField(term293713, term293713.getClass(), "lastPlayMode", 0);
        setIntField(term293713, term293713.getClass(), "lastPlaceId", 0);
        setField(term293713, term293713.getClass(), "lastPlaceName", null);
        setIntField(term293713, term293713.getClass(), "lastAllNetId", 0);
        setIntField(term293713, term293713.getClass(), "lastRegionId", 0);
        setField(term293713, term293713.getClass(), "lastRegionName", null);
        setField(term293713, term293713.getClass(), "lastClientId", null);
        setField(term293713, term293713.getClass(), "lastCountryCode", null);
        setIntField(term293713, term293713.getClass(), "lastSelectEMoney", 0);
        setIntField(term293713, term293713.getClass(), "lastSelectTicket", 0);
        setIntField(term293713, term293713.getClass(), "lastSelectCourse", 0);
        setIntField(term293713, term293713.getClass(), "lastCountCourse", 0);
        setField(term293713, term293713.getClass(), "firstGameId", null);
        setField(term293713, term293713.getClass(), "firstRomVersion", null);
        setField(term293713, term293713.getClass(), "firstDataVersion", null);
        setField(term293713, term293713.getClass(), "firstPlayDate", null);
        setField(term293713, term293713.getClass(), "compatibleCmVersion", null);
        setField(term293713, term293713.getClass(), "dailyBonusDate", null);
        setField(term293713, term293713.getClass(), "dailyCourseBonusDate", null);
        setField(term293713, term293713.getClass(), "lastPairLoginDate", null);
        setField(term293713, term293713.getClass(), "lastTrialPlayDate", null);
        setIntField(term293713, term293713.getClass(), "playVsCount", 0);
        setIntField(term293713, term293713.getClass(), "playSyncCount", 0);
        setIntField(term293713, term293713.getClass(), "winCount", 0);
        setIntField(term293713, term293713.getClass(), "helpCount", 0);
        setIntField(term293713, term293713.getClass(), "comboCount", 0);
        setLongField(term293713, term293713.getClass(), "totalDeluxscore", 0L);
        setLongField(term293713, term293713.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293713, term293713.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293713, term293713.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293713, term293713.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293713, term293713.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293713, term293713.getClass(), "totalSync", 0);
        setIntField(term293713, term293713.getClass(), "totalBasicSync", 0);
        setIntField(term293713, term293713.getClass(), "totalAdvancedSync", 0);
        setIntField(term293713, term293713.getClass(), "totalExpertSync", 0);
        setIntField(term293713, term293713.getClass(), "totalMasterSync", 0);
        setIntField(term293713, term293713.getClass(), "totalReMasterSync", 0);
        setLongField(term293713, term293713.getClass(), "totalAchievement", 0L);
        setLongField(term293713, term293713.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293713, term293713.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293713, term293713.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293713, term293713.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293713, term293713.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293713, term293713.getClass(), "playerOldRating", 0L);
        setLongField(term293713, term293713.getClass(), "playerNewRating", 0L);
        setIntField(term293713, term293713.getClass(), "banState", 0);
        setLongField(term293713, term293713.getClass(), "dateTime", 0L);
        term293768 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term293768;
        callMethod(klass, "setTotalMasterDeluxscore", argTypes, term293713, args);
    }

};


