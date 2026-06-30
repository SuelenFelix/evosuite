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

public class UserDetail_setLastCountCourse_1981935408277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292648;
     Object term292703;

    public UserDetail_setLastCountCourse_1981935408277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292648 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292648, term292648.getClass(), "id", 0L);
        setField(term292648, term292648.getClass(), "card", null);
        setField(term292648, term292648.getClass(), "userName", null);
        setIntField(term292648, term292648.getClass(), "isNetMember", 0);
        setIntField(term292648, term292648.getClass(), "iconId", 0);
        setIntField(term292648, term292648.getClass(), "plateId", 0);
        setIntField(term292648, term292648.getClass(), "titleId", 0);
        setIntField(term292648, term292648.getClass(), "partnerId", 0);
        setIntField(term292648, term292648.getClass(), "frameId", 0);
        setIntField(term292648, term292648.getClass(), "selectMapId", 0);
        setIntField(term292648, term292648.getClass(), "totalAwake", 0);
        setIntField(term292648, term292648.getClass(), "gradeRating", 0);
        setIntField(term292648, term292648.getClass(), "musicRating", 0);
        setIntField(term292648, term292648.getClass(), "playerRating", 0);
        setIntField(term292648, term292648.getClass(), "highestRating", 0);
        setIntField(term292648, term292648.getClass(), "gradeRank", 0);
        setIntField(term292648, term292648.getClass(), "classRank", 0);
        setIntField(term292648, term292648.getClass(), "courseRank", 0);
        setField(term292648, term292648.getClass(), "charaSlot", null);
        setField(term292648, term292648.getClass(), "charaLockSlot", null);
        setLongField(term292648, term292648.getClass(), "contentBit", 0L);
        setIntField(term292648, term292648.getClass(), "playCount", 0);
        setField(term292648, term292648.getClass(), "eventWatchedDate", null);
        setField(term292648, term292648.getClass(), "lastGameId", null);
        setField(term292648, term292648.getClass(), "lastRomVersion", null);
        setField(term292648, term292648.getClass(), "lastDataVersion", null);
        setField(term292648, term292648.getClass(), "lastLoginDate", null);
        setField(term292648, term292648.getClass(), "lastPlayDate", null);
        setIntField(term292648, term292648.getClass(), "lastPlayCredit", 0);
        setIntField(term292648, term292648.getClass(), "lastPlayMode", 0);
        setIntField(term292648, term292648.getClass(), "lastPlaceId", 0);
        setField(term292648, term292648.getClass(), "lastPlaceName", null);
        setIntField(term292648, term292648.getClass(), "lastAllNetId", 0);
        setIntField(term292648, term292648.getClass(), "lastRegionId", 0);
        setField(term292648, term292648.getClass(), "lastRegionName", null);
        setField(term292648, term292648.getClass(), "lastClientId", null);
        setField(term292648, term292648.getClass(), "lastCountryCode", null);
        setIntField(term292648, term292648.getClass(), "lastSelectEMoney", 0);
        setIntField(term292648, term292648.getClass(), "lastSelectTicket", 0);
        setIntField(term292648, term292648.getClass(), "lastSelectCourse", 0);
        setIntField(term292648, term292648.getClass(), "lastCountCourse", 0);
        setField(term292648, term292648.getClass(), "firstGameId", null);
        setField(term292648, term292648.getClass(), "firstRomVersion", null);
        setField(term292648, term292648.getClass(), "firstDataVersion", null);
        setField(term292648, term292648.getClass(), "firstPlayDate", null);
        setField(term292648, term292648.getClass(), "compatibleCmVersion", null);
        setField(term292648, term292648.getClass(), "dailyBonusDate", null);
        setField(term292648, term292648.getClass(), "dailyCourseBonusDate", null);
        setField(term292648, term292648.getClass(), "lastPairLoginDate", null);
        setField(term292648, term292648.getClass(), "lastTrialPlayDate", null);
        setIntField(term292648, term292648.getClass(), "playVsCount", 0);
        setIntField(term292648, term292648.getClass(), "playSyncCount", 0);
        setIntField(term292648, term292648.getClass(), "winCount", 0);
        setIntField(term292648, term292648.getClass(), "helpCount", 0);
        setIntField(term292648, term292648.getClass(), "comboCount", 0);
        setLongField(term292648, term292648.getClass(), "totalDeluxscore", 0L);
        setLongField(term292648, term292648.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292648, term292648.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292648, term292648.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292648, term292648.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292648, term292648.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292648, term292648.getClass(), "totalSync", 0);
        setIntField(term292648, term292648.getClass(), "totalBasicSync", 0);
        setIntField(term292648, term292648.getClass(), "totalAdvancedSync", 0);
        setIntField(term292648, term292648.getClass(), "totalExpertSync", 0);
        setIntField(term292648, term292648.getClass(), "totalMasterSync", 0);
        setIntField(term292648, term292648.getClass(), "totalReMasterSync", 0);
        setLongField(term292648, term292648.getClass(), "totalAchievement", 0L);
        setLongField(term292648, term292648.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292648, term292648.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292648, term292648.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292648, term292648.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292648, term292648.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292648, term292648.getClass(), "playerOldRating", 0L);
        setLongField(term292648, term292648.getClass(), "playerNewRating", 0L);
        setIntField(term292648, term292648.getClass(), "banState", 0);
        setLongField(term292648, term292648.getClass(), "dateTime", 0L);
        term292703 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292703;
        callMethod(klass, "setLastCountCourse", argTypes, term292648, args);
    }

};


