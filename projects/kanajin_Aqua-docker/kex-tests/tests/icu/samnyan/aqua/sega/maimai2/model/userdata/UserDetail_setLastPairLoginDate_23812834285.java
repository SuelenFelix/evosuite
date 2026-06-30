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

public class UserDetail_setLastPairLoginDate_23812834285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293090;

    public UserDetail_setLastPairLoginDate_23812834285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293090 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293090, term293090.getClass(), "id", 0L);
        setField(term293090, term293090.getClass(), "card", null);
        setField(term293090, term293090.getClass(), "userName", null);
        setIntField(term293090, term293090.getClass(), "isNetMember", 0);
        setIntField(term293090, term293090.getClass(), "iconId", 0);
        setIntField(term293090, term293090.getClass(), "plateId", 0);
        setIntField(term293090, term293090.getClass(), "titleId", 0);
        setIntField(term293090, term293090.getClass(), "partnerId", 0);
        setIntField(term293090, term293090.getClass(), "frameId", 0);
        setIntField(term293090, term293090.getClass(), "selectMapId", 0);
        setIntField(term293090, term293090.getClass(), "totalAwake", 0);
        setIntField(term293090, term293090.getClass(), "gradeRating", 0);
        setIntField(term293090, term293090.getClass(), "musicRating", 0);
        setIntField(term293090, term293090.getClass(), "playerRating", 0);
        setIntField(term293090, term293090.getClass(), "highestRating", 0);
        setIntField(term293090, term293090.getClass(), "gradeRank", 0);
        setIntField(term293090, term293090.getClass(), "classRank", 0);
        setIntField(term293090, term293090.getClass(), "courseRank", 0);
        setField(term293090, term293090.getClass(), "charaSlot", null);
        setField(term293090, term293090.getClass(), "charaLockSlot", null);
        setLongField(term293090, term293090.getClass(), "contentBit", 0L);
        setIntField(term293090, term293090.getClass(), "playCount", 0);
        setField(term293090, term293090.getClass(), "eventWatchedDate", null);
        setField(term293090, term293090.getClass(), "lastGameId", null);
        setField(term293090, term293090.getClass(), "lastRomVersion", null);
        setField(term293090, term293090.getClass(), "lastDataVersion", null);
        setField(term293090, term293090.getClass(), "lastLoginDate", null);
        setField(term293090, term293090.getClass(), "lastPlayDate", null);
        setIntField(term293090, term293090.getClass(), "lastPlayCredit", 0);
        setIntField(term293090, term293090.getClass(), "lastPlayMode", 0);
        setIntField(term293090, term293090.getClass(), "lastPlaceId", 0);
        setField(term293090, term293090.getClass(), "lastPlaceName", null);
        setIntField(term293090, term293090.getClass(), "lastAllNetId", 0);
        setIntField(term293090, term293090.getClass(), "lastRegionId", 0);
        setField(term293090, term293090.getClass(), "lastRegionName", null);
        setField(term293090, term293090.getClass(), "lastClientId", null);
        setField(term293090, term293090.getClass(), "lastCountryCode", null);
        setIntField(term293090, term293090.getClass(), "lastSelectEMoney", 0);
        setIntField(term293090, term293090.getClass(), "lastSelectTicket", 0);
        setIntField(term293090, term293090.getClass(), "lastSelectCourse", 0);
        setIntField(term293090, term293090.getClass(), "lastCountCourse", 0);
        setField(term293090, term293090.getClass(), "firstGameId", null);
        setField(term293090, term293090.getClass(), "firstRomVersion", null);
        setField(term293090, term293090.getClass(), "firstDataVersion", null);
        setField(term293090, term293090.getClass(), "firstPlayDate", null);
        setField(term293090, term293090.getClass(), "compatibleCmVersion", null);
        setField(term293090, term293090.getClass(), "dailyBonusDate", null);
        setField(term293090, term293090.getClass(), "dailyCourseBonusDate", null);
        setField(term293090, term293090.getClass(), "lastPairLoginDate", null);
        setField(term293090, term293090.getClass(), "lastTrialPlayDate", null);
        setIntField(term293090, term293090.getClass(), "playVsCount", 0);
        setIntField(term293090, term293090.getClass(), "playSyncCount", 0);
        setIntField(term293090, term293090.getClass(), "winCount", 0);
        setIntField(term293090, term293090.getClass(), "helpCount", 0);
        setIntField(term293090, term293090.getClass(), "comboCount", 0);
        setLongField(term293090, term293090.getClass(), "totalDeluxscore", 0L);
        setLongField(term293090, term293090.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293090, term293090.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293090, term293090.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293090, term293090.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293090, term293090.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293090, term293090.getClass(), "totalSync", 0);
        setIntField(term293090, term293090.getClass(), "totalBasicSync", 0);
        setIntField(term293090, term293090.getClass(), "totalAdvancedSync", 0);
        setIntField(term293090, term293090.getClass(), "totalExpertSync", 0);
        setIntField(term293090, term293090.getClass(), "totalMasterSync", 0);
        setIntField(term293090, term293090.getClass(), "totalReMasterSync", 0);
        setLongField(term293090, term293090.getClass(), "totalAchievement", 0L);
        setLongField(term293090, term293090.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293090, term293090.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293090, term293090.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293090, term293090.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293090, term293090.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293090, term293090.getClass(), "playerOldRating", 0L);
        setLongField(term293090, term293090.getClass(), "playerNewRating", 0L);
        setIntField(term293090, term293090.getClass(), "banState", 0);
        setLongField(term293090, term293090.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPairLoginDate", argTypes, term293090, args);
    }

};


