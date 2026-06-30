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

public class UserDetail_setLastCountryCode_987814724273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292422;

    public UserDetail_setLastCountryCode_987814724273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292422 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292422, term292422.getClass(), "id", 0L);
        setField(term292422, term292422.getClass(), "card", null);
        setField(term292422, term292422.getClass(), "userName", null);
        setIntField(term292422, term292422.getClass(), "isNetMember", 0);
        setIntField(term292422, term292422.getClass(), "iconId", 0);
        setIntField(term292422, term292422.getClass(), "plateId", 0);
        setIntField(term292422, term292422.getClass(), "titleId", 0);
        setIntField(term292422, term292422.getClass(), "partnerId", 0);
        setIntField(term292422, term292422.getClass(), "frameId", 0);
        setIntField(term292422, term292422.getClass(), "selectMapId", 0);
        setIntField(term292422, term292422.getClass(), "totalAwake", 0);
        setIntField(term292422, term292422.getClass(), "gradeRating", 0);
        setIntField(term292422, term292422.getClass(), "musicRating", 0);
        setIntField(term292422, term292422.getClass(), "playerRating", 0);
        setIntField(term292422, term292422.getClass(), "highestRating", 0);
        setIntField(term292422, term292422.getClass(), "gradeRank", 0);
        setIntField(term292422, term292422.getClass(), "classRank", 0);
        setIntField(term292422, term292422.getClass(), "courseRank", 0);
        setField(term292422, term292422.getClass(), "charaSlot", null);
        setField(term292422, term292422.getClass(), "charaLockSlot", null);
        setLongField(term292422, term292422.getClass(), "contentBit", 0L);
        setIntField(term292422, term292422.getClass(), "playCount", 0);
        setField(term292422, term292422.getClass(), "eventWatchedDate", null);
        setField(term292422, term292422.getClass(), "lastGameId", null);
        setField(term292422, term292422.getClass(), "lastRomVersion", null);
        setField(term292422, term292422.getClass(), "lastDataVersion", null);
        setField(term292422, term292422.getClass(), "lastLoginDate", null);
        setField(term292422, term292422.getClass(), "lastPlayDate", null);
        setIntField(term292422, term292422.getClass(), "lastPlayCredit", 0);
        setIntField(term292422, term292422.getClass(), "lastPlayMode", 0);
        setIntField(term292422, term292422.getClass(), "lastPlaceId", 0);
        setField(term292422, term292422.getClass(), "lastPlaceName", null);
        setIntField(term292422, term292422.getClass(), "lastAllNetId", 0);
        setIntField(term292422, term292422.getClass(), "lastRegionId", 0);
        setField(term292422, term292422.getClass(), "lastRegionName", null);
        setField(term292422, term292422.getClass(), "lastClientId", null);
        setField(term292422, term292422.getClass(), "lastCountryCode", null);
        setIntField(term292422, term292422.getClass(), "lastSelectEMoney", 0);
        setIntField(term292422, term292422.getClass(), "lastSelectTicket", 0);
        setIntField(term292422, term292422.getClass(), "lastSelectCourse", 0);
        setIntField(term292422, term292422.getClass(), "lastCountCourse", 0);
        setField(term292422, term292422.getClass(), "firstGameId", null);
        setField(term292422, term292422.getClass(), "firstRomVersion", null);
        setField(term292422, term292422.getClass(), "firstDataVersion", null);
        setField(term292422, term292422.getClass(), "firstPlayDate", null);
        setField(term292422, term292422.getClass(), "compatibleCmVersion", null);
        setField(term292422, term292422.getClass(), "dailyBonusDate", null);
        setField(term292422, term292422.getClass(), "dailyCourseBonusDate", null);
        setField(term292422, term292422.getClass(), "lastPairLoginDate", null);
        setField(term292422, term292422.getClass(), "lastTrialPlayDate", null);
        setIntField(term292422, term292422.getClass(), "playVsCount", 0);
        setIntField(term292422, term292422.getClass(), "playSyncCount", 0);
        setIntField(term292422, term292422.getClass(), "winCount", 0);
        setIntField(term292422, term292422.getClass(), "helpCount", 0);
        setIntField(term292422, term292422.getClass(), "comboCount", 0);
        setLongField(term292422, term292422.getClass(), "totalDeluxscore", 0L);
        setLongField(term292422, term292422.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292422, term292422.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292422, term292422.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292422, term292422.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292422, term292422.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292422, term292422.getClass(), "totalSync", 0);
        setIntField(term292422, term292422.getClass(), "totalBasicSync", 0);
        setIntField(term292422, term292422.getClass(), "totalAdvancedSync", 0);
        setIntField(term292422, term292422.getClass(), "totalExpertSync", 0);
        setIntField(term292422, term292422.getClass(), "totalMasterSync", 0);
        setIntField(term292422, term292422.getClass(), "totalReMasterSync", 0);
        setLongField(term292422, term292422.getClass(), "totalAchievement", 0L);
        setLongField(term292422, term292422.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292422, term292422.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292422, term292422.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292422, term292422.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292422, term292422.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292422, term292422.getClass(), "playerOldRating", 0L);
        setLongField(term292422, term292422.getClass(), "playerNewRating", 0L);
        setIntField(term292422, term292422.getClass(), "banState", 0);
        setLongField(term292422, term292422.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastCountryCode", argTypes, term292422, args);
    }

};


