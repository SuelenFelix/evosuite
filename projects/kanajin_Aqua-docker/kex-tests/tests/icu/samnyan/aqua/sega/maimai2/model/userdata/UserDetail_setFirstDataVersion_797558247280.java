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

public class UserDetail_setFirstDataVersion_797558247280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292815;

    public UserDetail_setFirstDataVersion_797558247280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292815 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term292815, term292815.getClass(), "id", 0L);
        setField(term292815, term292815.getClass(), "card", null);
        setField(term292815, term292815.getClass(), "userName", null);
        setIntField(term292815, term292815.getClass(), "isNetMember", 0);
        setIntField(term292815, term292815.getClass(), "iconId", 0);
        setIntField(term292815, term292815.getClass(), "plateId", 0);
        setIntField(term292815, term292815.getClass(), "titleId", 0);
        setIntField(term292815, term292815.getClass(), "partnerId", 0);
        setIntField(term292815, term292815.getClass(), "frameId", 0);
        setIntField(term292815, term292815.getClass(), "selectMapId", 0);
        setIntField(term292815, term292815.getClass(), "totalAwake", 0);
        setIntField(term292815, term292815.getClass(), "gradeRating", 0);
        setIntField(term292815, term292815.getClass(), "musicRating", 0);
        setIntField(term292815, term292815.getClass(), "playerRating", 0);
        setIntField(term292815, term292815.getClass(), "highestRating", 0);
        setIntField(term292815, term292815.getClass(), "gradeRank", 0);
        setIntField(term292815, term292815.getClass(), "classRank", 0);
        setIntField(term292815, term292815.getClass(), "courseRank", 0);
        setField(term292815, term292815.getClass(), "charaSlot", null);
        setField(term292815, term292815.getClass(), "charaLockSlot", null);
        setLongField(term292815, term292815.getClass(), "contentBit", 0L);
        setIntField(term292815, term292815.getClass(), "playCount", 0);
        setField(term292815, term292815.getClass(), "eventWatchedDate", null);
        setField(term292815, term292815.getClass(), "lastGameId", null);
        setField(term292815, term292815.getClass(), "lastRomVersion", null);
        setField(term292815, term292815.getClass(), "lastDataVersion", null);
        setField(term292815, term292815.getClass(), "lastLoginDate", null);
        setField(term292815, term292815.getClass(), "lastPlayDate", null);
        setIntField(term292815, term292815.getClass(), "lastPlayCredit", 0);
        setIntField(term292815, term292815.getClass(), "lastPlayMode", 0);
        setIntField(term292815, term292815.getClass(), "lastPlaceId", 0);
        setField(term292815, term292815.getClass(), "lastPlaceName", null);
        setIntField(term292815, term292815.getClass(), "lastAllNetId", 0);
        setIntField(term292815, term292815.getClass(), "lastRegionId", 0);
        setField(term292815, term292815.getClass(), "lastRegionName", null);
        setField(term292815, term292815.getClass(), "lastClientId", null);
        setField(term292815, term292815.getClass(), "lastCountryCode", null);
        setIntField(term292815, term292815.getClass(), "lastSelectEMoney", 0);
        setIntField(term292815, term292815.getClass(), "lastSelectTicket", 0);
        setIntField(term292815, term292815.getClass(), "lastSelectCourse", 0);
        setIntField(term292815, term292815.getClass(), "lastCountCourse", 0);
        setField(term292815, term292815.getClass(), "firstGameId", null);
        setField(term292815, term292815.getClass(), "firstRomVersion", null);
        setField(term292815, term292815.getClass(), "firstDataVersion", null);
        setField(term292815, term292815.getClass(), "firstPlayDate", null);
        setField(term292815, term292815.getClass(), "compatibleCmVersion", null);
        setField(term292815, term292815.getClass(), "dailyBonusDate", null);
        setField(term292815, term292815.getClass(), "dailyCourseBonusDate", null);
        setField(term292815, term292815.getClass(), "lastPairLoginDate", null);
        setField(term292815, term292815.getClass(), "lastTrialPlayDate", null);
        setIntField(term292815, term292815.getClass(), "playVsCount", 0);
        setIntField(term292815, term292815.getClass(), "playSyncCount", 0);
        setIntField(term292815, term292815.getClass(), "winCount", 0);
        setIntField(term292815, term292815.getClass(), "helpCount", 0);
        setIntField(term292815, term292815.getClass(), "comboCount", 0);
        setLongField(term292815, term292815.getClass(), "totalDeluxscore", 0L);
        setLongField(term292815, term292815.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term292815, term292815.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term292815, term292815.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term292815, term292815.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term292815, term292815.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term292815, term292815.getClass(), "totalSync", 0);
        setIntField(term292815, term292815.getClass(), "totalBasicSync", 0);
        setIntField(term292815, term292815.getClass(), "totalAdvancedSync", 0);
        setIntField(term292815, term292815.getClass(), "totalExpertSync", 0);
        setIntField(term292815, term292815.getClass(), "totalMasterSync", 0);
        setIntField(term292815, term292815.getClass(), "totalReMasterSync", 0);
        setLongField(term292815, term292815.getClass(), "totalAchievement", 0L);
        setLongField(term292815, term292815.getClass(), "totalBasicAchievement", 0L);
        setLongField(term292815, term292815.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term292815, term292815.getClass(), "totalExpertAchievement", 0L);
        setLongField(term292815, term292815.getClass(), "totalMasterAchievement", 0L);
        setLongField(term292815, term292815.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term292815, term292815.getClass(), "playerOldRating", 0L);
        setLongField(term292815, term292815.getClass(), "playerNewRating", 0L);
        setIntField(term292815, term292815.getClass(), "banState", 0);
        setLongField(term292815, term292815.getClass(), "dateTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstDataVersion", argTypes, term292815, args);
    }

};


