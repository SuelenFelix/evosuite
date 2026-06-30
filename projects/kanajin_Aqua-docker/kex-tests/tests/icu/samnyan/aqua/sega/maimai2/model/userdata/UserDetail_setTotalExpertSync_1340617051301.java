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

public class UserDetail_setTotalExpertSync_1340617051301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293998;
     Object term294053;

    public UserDetail_setTotalExpertSync_1340617051301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293998 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293998, term293998.getClass(), "id", 0L);
        setField(term293998, term293998.getClass(), "card", null);
        setField(term293998, term293998.getClass(), "userName", null);
        setIntField(term293998, term293998.getClass(), "isNetMember", 0);
        setIntField(term293998, term293998.getClass(), "iconId", 0);
        setIntField(term293998, term293998.getClass(), "plateId", 0);
        setIntField(term293998, term293998.getClass(), "titleId", 0);
        setIntField(term293998, term293998.getClass(), "partnerId", 0);
        setIntField(term293998, term293998.getClass(), "frameId", 0);
        setIntField(term293998, term293998.getClass(), "selectMapId", 0);
        setIntField(term293998, term293998.getClass(), "totalAwake", 0);
        setIntField(term293998, term293998.getClass(), "gradeRating", 0);
        setIntField(term293998, term293998.getClass(), "musicRating", 0);
        setIntField(term293998, term293998.getClass(), "playerRating", 0);
        setIntField(term293998, term293998.getClass(), "highestRating", 0);
        setIntField(term293998, term293998.getClass(), "gradeRank", 0);
        setIntField(term293998, term293998.getClass(), "classRank", 0);
        setIntField(term293998, term293998.getClass(), "courseRank", 0);
        setField(term293998, term293998.getClass(), "charaSlot", null);
        setField(term293998, term293998.getClass(), "charaLockSlot", null);
        setLongField(term293998, term293998.getClass(), "contentBit", 0L);
        setIntField(term293998, term293998.getClass(), "playCount", 0);
        setField(term293998, term293998.getClass(), "eventWatchedDate", null);
        setField(term293998, term293998.getClass(), "lastGameId", null);
        setField(term293998, term293998.getClass(), "lastRomVersion", null);
        setField(term293998, term293998.getClass(), "lastDataVersion", null);
        setField(term293998, term293998.getClass(), "lastLoginDate", null);
        setField(term293998, term293998.getClass(), "lastPlayDate", null);
        setIntField(term293998, term293998.getClass(), "lastPlayCredit", 0);
        setIntField(term293998, term293998.getClass(), "lastPlayMode", 0);
        setIntField(term293998, term293998.getClass(), "lastPlaceId", 0);
        setField(term293998, term293998.getClass(), "lastPlaceName", null);
        setIntField(term293998, term293998.getClass(), "lastAllNetId", 0);
        setIntField(term293998, term293998.getClass(), "lastRegionId", 0);
        setField(term293998, term293998.getClass(), "lastRegionName", null);
        setField(term293998, term293998.getClass(), "lastClientId", null);
        setField(term293998, term293998.getClass(), "lastCountryCode", null);
        setIntField(term293998, term293998.getClass(), "lastSelectEMoney", 0);
        setIntField(term293998, term293998.getClass(), "lastSelectTicket", 0);
        setIntField(term293998, term293998.getClass(), "lastSelectCourse", 0);
        setIntField(term293998, term293998.getClass(), "lastCountCourse", 0);
        setField(term293998, term293998.getClass(), "firstGameId", null);
        setField(term293998, term293998.getClass(), "firstRomVersion", null);
        setField(term293998, term293998.getClass(), "firstDataVersion", null);
        setField(term293998, term293998.getClass(), "firstPlayDate", null);
        setField(term293998, term293998.getClass(), "compatibleCmVersion", null);
        setField(term293998, term293998.getClass(), "dailyBonusDate", null);
        setField(term293998, term293998.getClass(), "dailyCourseBonusDate", null);
        setField(term293998, term293998.getClass(), "lastPairLoginDate", null);
        setField(term293998, term293998.getClass(), "lastTrialPlayDate", null);
        setIntField(term293998, term293998.getClass(), "playVsCount", 0);
        setIntField(term293998, term293998.getClass(), "playSyncCount", 0);
        setIntField(term293998, term293998.getClass(), "winCount", 0);
        setIntField(term293998, term293998.getClass(), "helpCount", 0);
        setIntField(term293998, term293998.getClass(), "comboCount", 0);
        setLongField(term293998, term293998.getClass(), "totalDeluxscore", 0L);
        setLongField(term293998, term293998.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293998, term293998.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293998, term293998.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293998, term293998.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293998, term293998.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293998, term293998.getClass(), "totalSync", 0);
        setIntField(term293998, term293998.getClass(), "totalBasicSync", 0);
        setIntField(term293998, term293998.getClass(), "totalAdvancedSync", 0);
        setIntField(term293998, term293998.getClass(), "totalExpertSync", 0);
        setIntField(term293998, term293998.getClass(), "totalMasterSync", 0);
        setIntField(term293998, term293998.getClass(), "totalReMasterSync", 0);
        setLongField(term293998, term293998.getClass(), "totalAchievement", 0L);
        setLongField(term293998, term293998.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293998, term293998.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293998, term293998.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293998, term293998.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293998, term293998.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293998, term293998.getClass(), "playerOldRating", 0L);
        setLongField(term293998, term293998.getClass(), "playerNewRating", 0L);
        setIntField(term293998, term293998.getClass(), "banState", 0);
        setLongField(term293998, term293998.getClass(), "dateTime", 0L);
        term294053 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term294053;
        callMethod(klass, "setTotalExpertSync", argTypes, term293998, args);
    }

};


