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

public class UserDetail_setFirstGameId_2037970836278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292705;

    public UserDetail_setFirstGameId_2037970836278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292705 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292705, term292705.getClass(), "id", 0L);
        setField(term292705, term292705.getClass(), "card", null);
        setField(term292705, term292705.getClass(), "userName", null);
        setIntField(term292705, term292705.getClass(), "isNetMember", 0);
        setIntField(term292705, term292705.getClass(), "iconId", 0);
        setIntField(term292705, term292705.getClass(), "plateId", 0);
        setIntField(term292705, term292705.getClass(), "titleId", 0);
        setIntField(term292705, term292705.getClass(), "partnerId", 0);
        setIntField(term292705, term292705.getClass(), "frameId", 0);
        setIntField(term292705, term292705.getClass(), "selectMapId", 0);
        setIntField(term292705, term292705.getClass(), "totalAwake", 0);
        setIntField(term292705, term292705.getClass(), "gradeRating", 0);
        setIntField(term292705, term292705.getClass(), "musicRating", 0);
        setIntField(term292705, term292705.getClass(), "playerRating", 0);
        setIntField(term292705, term292705.getClass(), "highestRating", 0);
        setIntField(term292705, term292705.getClass(), "gradeRank", 0);
        setIntField(term292705, term292705.getClass(), "classRank", 0);
        setIntField(term292705, term292705.getClass(), "courseRank", 0);
        setField(term292705, term292705.getClass(), "charaSlot", null);
        setField(term292705, term292705.getClass(), "charaLockSlot", null);
        setLongField(term292705, term292705.getClass(), "contentBit", 0L);
        setIntField(term292705, term292705.getClass(), "playCount", 0);
        setField(term292705, term292705.getClass(), "eventWatchedDate", null);
        setField(term292705, term292705.getClass(), "lastGameId", null);
        setField(term292705, term292705.getClass(), "lastRomVersion", null);
        setField(term292705, term292705.getClass(), "lastDataVersion", null);
        setField(term292705, term292705.getClass(), "lastLoginDate", null);
        setField(term292705, term292705.getClass(), "lastPlayDate", null);
        setIntField(term292705, term292705.getClass(), "lastPlayCredit", 0);
        setIntField(term292705, term292705.getClass(), "lastPlayMode", 0);
        setIntField(term292705, term292705.getClass(), "lastPlaceId", 0);
        setField(term292705, term292705.getClass(), "lastPlaceName", null);
        setIntField(term292705, term292705.getClass(), "lastAllNetId", 0);
        setIntField(term292705, term292705.getClass(), "lastRegionId", 0);
        setField(term292705, term292705.getClass(), "lastRegionName", null);
        setField(term292705, term292705.getClass(), "lastClientId", null);
        setField(term292705, term292705.getClass(), "lastCountryCode", null);
        setIntField(term292705, term292705.getClass(), "lastSelectEMoney", 0);
        setIntField(term292705, term292705.getClass(), "lastSelectTicket", 0);
        setIntField(term292705, term292705.getClass(), "lastSelectCourse", 0);
        setIntField(term292705, term292705.getClass(), "lastCountCourse", 0);
        setField(term292705, term292705.getClass(), "firstGameId", null);
        setField(term292705, term292705.getClass(), "firstRomVersion", null);
        setField(term292705, term292705.getClass(), "firstDataVersion", null);
        setField(term292705, term292705.getClass(), "firstPlayDate", null);
        setField(term292705, term292705.getClass(), "compatibleCmVersion", null);
        setField(term292705, term292705.getClass(), "dailyBonusDate", null);
        setField(term292705, term292705.getClass(), "dailyCourseBonusDate", null);
        setField(term292705, term292705.getClass(), "lastPairLoginDate", null);
        setField(term292705, term292705.getClass(), "lastTrialPlayDate", null);
        setIntField(term292705, term292705.getClass(), "playVsCount", 0);
        setIntField(term292705, term292705.getClass(), "playSyncCount", 0);
        setIntField(term292705, term292705.getClass(), "winCount", 0);
        setIntField(term292705, term292705.getClass(), "helpCount", 0);
        setIntField(term292705, term292705.getClass(), "comboCount", 0);
        setLongField(term292705, term292705.getClass(), "totalDeluxscore", 0L);
        setLongField(term292705, term292705.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292705, term292705.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292705, term292705.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292705, term292705.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292705, term292705.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292705, term292705.getClass(), "totalSync", 0);
        setIntField(term292705, term292705.getClass(), "totalBasicSync", 0);
        setIntField(term292705, term292705.getClass(), "totalAdvancedSync", 0);
        setIntField(term292705, term292705.getClass(), "totalExpertSync", 0);
        setIntField(term292705, term292705.getClass(), "totalMasterSync", 0);
        setIntField(term292705, term292705.getClass(), "totalReMasterSync", 0);
        setLongField(term292705, term292705.getClass(), "totalAchievement", 0L);
        setLongField(term292705, term292705.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292705, term292705.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292705, term292705.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292705, term292705.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292705, term292705.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292705, term292705.getClass(), "playerOldRating", 0L);
        setLongField(term292705, term292705.getClass(), "playerNewRating", 0L);
        setIntField(term292705, term292705.getClass(), "banState", 0);
        setLongField(term292705, term292705.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstGameId", argTypes, term292705, args);
    }

};


