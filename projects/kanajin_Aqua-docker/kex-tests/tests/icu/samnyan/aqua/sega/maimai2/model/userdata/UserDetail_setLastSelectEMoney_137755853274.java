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

public class UserDetail_setLastSelectEMoney_137755853274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292477;
     Object term292532;

    public UserDetail_setLastSelectEMoney_137755853274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292477 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292477, term292477.getClass(), "id", 0L);
        setField(term292477, term292477.getClass(), "card", null);
        setField(term292477, term292477.getClass(), "userName", null);
        setIntField(term292477, term292477.getClass(), "isNetMember", 0);
        setIntField(term292477, term292477.getClass(), "iconId", 0);
        setIntField(term292477, term292477.getClass(), "plateId", 0);
        setIntField(term292477, term292477.getClass(), "titleId", 0);
        setIntField(term292477, term292477.getClass(), "partnerId", 0);
        setIntField(term292477, term292477.getClass(), "frameId", 0);
        setIntField(term292477, term292477.getClass(), "selectMapId", 0);
        setIntField(term292477, term292477.getClass(), "totalAwake", 0);
        setIntField(term292477, term292477.getClass(), "gradeRating", 0);
        setIntField(term292477, term292477.getClass(), "musicRating", 0);
        setIntField(term292477, term292477.getClass(), "playerRating", 0);
        setIntField(term292477, term292477.getClass(), "highestRating", 0);
        setIntField(term292477, term292477.getClass(), "gradeRank", 0);
        setIntField(term292477, term292477.getClass(), "classRank", 0);
        setIntField(term292477, term292477.getClass(), "courseRank", 0);
        setField(term292477, term292477.getClass(), "charaSlot", null);
        setField(term292477, term292477.getClass(), "charaLockSlot", null);
        setLongField(term292477, term292477.getClass(), "contentBit", 0L);
        setIntField(term292477, term292477.getClass(), "playCount", 0);
        setField(term292477, term292477.getClass(), "eventWatchedDate", null);
        setField(term292477, term292477.getClass(), "lastGameId", null);
        setField(term292477, term292477.getClass(), "lastRomVersion", null);
        setField(term292477, term292477.getClass(), "lastDataVersion", null);
        setField(term292477, term292477.getClass(), "lastLoginDate", null);
        setField(term292477, term292477.getClass(), "lastPlayDate", null);
        setIntField(term292477, term292477.getClass(), "lastPlayCredit", 0);
        setIntField(term292477, term292477.getClass(), "lastPlayMode", 0);
        setIntField(term292477, term292477.getClass(), "lastPlaceId", 0);
        setField(term292477, term292477.getClass(), "lastPlaceName", null);
        setIntField(term292477, term292477.getClass(), "lastAllNetId", 0);
        setIntField(term292477, term292477.getClass(), "lastRegionId", 0);
        setField(term292477, term292477.getClass(), "lastRegionName", null);
        setField(term292477, term292477.getClass(), "lastClientId", null);
        setField(term292477, term292477.getClass(), "lastCountryCode", null);
        setIntField(term292477, term292477.getClass(), "lastSelectEMoney", 0);
        setIntField(term292477, term292477.getClass(), "lastSelectTicket", 0);
        setIntField(term292477, term292477.getClass(), "lastSelectCourse", 0);
        setIntField(term292477, term292477.getClass(), "lastCountCourse", 0);
        setField(term292477, term292477.getClass(), "firstGameId", null);
        setField(term292477, term292477.getClass(), "firstRomVersion", null);
        setField(term292477, term292477.getClass(), "firstDataVersion", null);
        setField(term292477, term292477.getClass(), "firstPlayDate", null);
        setField(term292477, term292477.getClass(), "compatibleCmVersion", null);
        setField(term292477, term292477.getClass(), "dailyBonusDate", null);
        setField(term292477, term292477.getClass(), "dailyCourseBonusDate", null);
        setField(term292477, term292477.getClass(), "lastPairLoginDate", null);
        setField(term292477, term292477.getClass(), "lastTrialPlayDate", null);
        setIntField(term292477, term292477.getClass(), "playVsCount", 0);
        setIntField(term292477, term292477.getClass(), "playSyncCount", 0);
        setIntField(term292477, term292477.getClass(), "winCount", 0);
        setIntField(term292477, term292477.getClass(), "helpCount", 0);
        setIntField(term292477, term292477.getClass(), "comboCount", 0);
        setLongField(term292477, term292477.getClass(), "totalDeluxscore", 0L);
        setLongField(term292477, term292477.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292477, term292477.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292477, term292477.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292477, term292477.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292477, term292477.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292477, term292477.getClass(), "totalSync", 0);
        setIntField(term292477, term292477.getClass(), "totalBasicSync", 0);
        setIntField(term292477, term292477.getClass(), "totalAdvancedSync", 0);
        setIntField(term292477, term292477.getClass(), "totalExpertSync", 0);
        setIntField(term292477, term292477.getClass(), "totalMasterSync", 0);
        setIntField(term292477, term292477.getClass(), "totalReMasterSync", 0);
        setLongField(term292477, term292477.getClass(), "totalAchievement", 0L);
        setLongField(term292477, term292477.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292477, term292477.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292477, term292477.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292477, term292477.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292477, term292477.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292477, term292477.getClass(), "playerOldRating", 0L);
        setLongField(term292477, term292477.getClass(), "playerNewRating", 0L);
        setIntField(term292477, term292477.getClass(), "banState", 0);
        setLongField(term292477, term292477.getClass(), "dateTime", 0L);
        term292532 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292532;
        callMethod(klass, "setLastSelectEMoney", argTypes, term292477, args);
    }

};


