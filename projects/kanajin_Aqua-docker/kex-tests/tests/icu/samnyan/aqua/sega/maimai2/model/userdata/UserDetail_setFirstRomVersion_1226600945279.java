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

public class UserDetail_setFirstRomVersion_1226600945279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292760;

    public UserDetail_setFirstRomVersion_1226600945279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292760 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292760, term292760.getClass(), "id", 0L);
        setField(term292760, term292760.getClass(), "card", null);
        setField(term292760, term292760.getClass(), "userName", null);
        setIntField(term292760, term292760.getClass(), "isNetMember", 0);
        setIntField(term292760, term292760.getClass(), "iconId", 0);
        setIntField(term292760, term292760.getClass(), "plateId", 0);
        setIntField(term292760, term292760.getClass(), "titleId", 0);
        setIntField(term292760, term292760.getClass(), "partnerId", 0);
        setIntField(term292760, term292760.getClass(), "frameId", 0);
        setIntField(term292760, term292760.getClass(), "selectMapId", 0);
        setIntField(term292760, term292760.getClass(), "totalAwake", 0);
        setIntField(term292760, term292760.getClass(), "gradeRating", 0);
        setIntField(term292760, term292760.getClass(), "musicRating", 0);
        setIntField(term292760, term292760.getClass(), "playerRating", 0);
        setIntField(term292760, term292760.getClass(), "highestRating", 0);
        setIntField(term292760, term292760.getClass(), "gradeRank", 0);
        setIntField(term292760, term292760.getClass(), "classRank", 0);
        setIntField(term292760, term292760.getClass(), "courseRank", 0);
        setField(term292760, term292760.getClass(), "charaSlot", null);
        setField(term292760, term292760.getClass(), "charaLockSlot", null);
        setLongField(term292760, term292760.getClass(), "contentBit", 0L);
        setIntField(term292760, term292760.getClass(), "playCount", 0);
        setField(term292760, term292760.getClass(), "eventWatchedDate", null);
        setField(term292760, term292760.getClass(), "lastGameId", null);
        setField(term292760, term292760.getClass(), "lastRomVersion", null);
        setField(term292760, term292760.getClass(), "lastDataVersion", null);
        setField(term292760, term292760.getClass(), "lastLoginDate", null);
        setField(term292760, term292760.getClass(), "lastPlayDate", null);
        setIntField(term292760, term292760.getClass(), "lastPlayCredit", 0);
        setIntField(term292760, term292760.getClass(), "lastPlayMode", 0);
        setIntField(term292760, term292760.getClass(), "lastPlaceId", 0);
        setField(term292760, term292760.getClass(), "lastPlaceName", null);
        setIntField(term292760, term292760.getClass(), "lastAllNetId", 0);
        setIntField(term292760, term292760.getClass(), "lastRegionId", 0);
        setField(term292760, term292760.getClass(), "lastRegionName", null);
        setField(term292760, term292760.getClass(), "lastClientId", null);
        setField(term292760, term292760.getClass(), "lastCountryCode", null);
        setIntField(term292760, term292760.getClass(), "lastSelectEMoney", 0);
        setIntField(term292760, term292760.getClass(), "lastSelectTicket", 0);
        setIntField(term292760, term292760.getClass(), "lastSelectCourse", 0);
        setIntField(term292760, term292760.getClass(), "lastCountCourse", 0);
        setField(term292760, term292760.getClass(), "firstGameId", null);
        setField(term292760, term292760.getClass(), "firstRomVersion", null);
        setField(term292760, term292760.getClass(), "firstDataVersion", null);
        setField(term292760, term292760.getClass(), "firstPlayDate", null);
        setField(term292760, term292760.getClass(), "compatibleCmVersion", null);
        setField(term292760, term292760.getClass(), "dailyBonusDate", null);
        setField(term292760, term292760.getClass(), "dailyCourseBonusDate", null);
        setField(term292760, term292760.getClass(), "lastPairLoginDate", null);
        setField(term292760, term292760.getClass(), "lastTrialPlayDate", null);
        setIntField(term292760, term292760.getClass(), "playVsCount", 0);
        setIntField(term292760, term292760.getClass(), "playSyncCount", 0);
        setIntField(term292760, term292760.getClass(), "winCount", 0);
        setIntField(term292760, term292760.getClass(), "helpCount", 0);
        setIntField(term292760, term292760.getClass(), "comboCount", 0);
        setLongField(term292760, term292760.getClass(), "totalDeluxscore", 0L);
        setLongField(term292760, term292760.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292760, term292760.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292760, term292760.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292760, term292760.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292760, term292760.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292760, term292760.getClass(), "totalSync", 0);
        setIntField(term292760, term292760.getClass(), "totalBasicSync", 0);
        setIntField(term292760, term292760.getClass(), "totalAdvancedSync", 0);
        setIntField(term292760, term292760.getClass(), "totalExpertSync", 0);
        setIntField(term292760, term292760.getClass(), "totalMasterSync", 0);
        setIntField(term292760, term292760.getClass(), "totalReMasterSync", 0);
        setLongField(term292760, term292760.getClass(), "totalAchievement", 0L);
        setLongField(term292760, term292760.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292760, term292760.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292760, term292760.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292760, term292760.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292760, term292760.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292760, term292760.getClass(), "playerOldRating", 0L);
        setLongField(term292760, term292760.getClass(), "playerNewRating", 0L);
        setIntField(term292760, term292760.getClass(), "banState", 0);
        setLongField(term292760, term292760.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstRomVersion", argTypes, term292760, args);
    }

};


