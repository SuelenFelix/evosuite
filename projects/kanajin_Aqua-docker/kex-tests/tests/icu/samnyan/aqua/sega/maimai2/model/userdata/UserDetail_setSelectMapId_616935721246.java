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

public class UserDetail_setSelectMapId_616935721246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290905;
     Object term290960;

    public UserDetail_setSelectMapId_616935721246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290905 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290905, term290905.getClass(), "id", 0L);
        setField(term290905, term290905.getClass(), "card", null);
        setField(term290905, term290905.getClass(), "userName", null);
        setIntField(term290905, term290905.getClass(), "isNetMember", 0);
        setIntField(term290905, term290905.getClass(), "iconId", 0);
        setIntField(term290905, term290905.getClass(), "plateId", 0);
        setIntField(term290905, term290905.getClass(), "titleId", 0);
        setIntField(term290905, term290905.getClass(), "partnerId", 0);
        setIntField(term290905, term290905.getClass(), "frameId", 0);
        setIntField(term290905, term290905.getClass(), "selectMapId", 0);
        setIntField(term290905, term290905.getClass(), "totalAwake", 0);
        setIntField(term290905, term290905.getClass(), "gradeRating", 0);
        setIntField(term290905, term290905.getClass(), "musicRating", 0);
        setIntField(term290905, term290905.getClass(), "playerRating", 0);
        setIntField(term290905, term290905.getClass(), "highestRating", 0);
        setIntField(term290905, term290905.getClass(), "gradeRank", 0);
        setIntField(term290905, term290905.getClass(), "classRank", 0);
        setIntField(term290905, term290905.getClass(), "courseRank", 0);
        setField(term290905, term290905.getClass(), "charaSlot", null);
        setField(term290905, term290905.getClass(), "charaLockSlot", null);
        setLongField(term290905, term290905.getClass(), "contentBit", 0L);
        setIntField(term290905, term290905.getClass(), "playCount", 0);
        setField(term290905, term290905.getClass(), "eventWatchedDate", null);
        setField(term290905, term290905.getClass(), "lastGameId", null);
        setField(term290905, term290905.getClass(), "lastRomVersion", null);
        setField(term290905, term290905.getClass(), "lastDataVersion", null);
        setField(term290905, term290905.getClass(), "lastLoginDate", null);
        setField(term290905, term290905.getClass(), "lastPlayDate", null);
        setIntField(term290905, term290905.getClass(), "lastPlayCredit", 0);
        setIntField(term290905, term290905.getClass(), "lastPlayMode", 0);
        setIntField(term290905, term290905.getClass(), "lastPlaceId", 0);
        setField(term290905, term290905.getClass(), "lastPlaceName", null);
        setIntField(term290905, term290905.getClass(), "lastAllNetId", 0);
        setIntField(term290905, term290905.getClass(), "lastRegionId", 0);
        setField(term290905, term290905.getClass(), "lastRegionName", null);
        setField(term290905, term290905.getClass(), "lastClientId", null);
        setField(term290905, term290905.getClass(), "lastCountryCode", null);
        setIntField(term290905, term290905.getClass(), "lastSelectEMoney", 0);
        setIntField(term290905, term290905.getClass(), "lastSelectTicket", 0);
        setIntField(term290905, term290905.getClass(), "lastSelectCourse", 0);
        setIntField(term290905, term290905.getClass(), "lastCountCourse", 0);
        setField(term290905, term290905.getClass(), "firstGameId", null);
        setField(term290905, term290905.getClass(), "firstRomVersion", null);
        setField(term290905, term290905.getClass(), "firstDataVersion", null);
        setField(term290905, term290905.getClass(), "firstPlayDate", null);
        setField(term290905, term290905.getClass(), "compatibleCmVersion", null);
        setField(term290905, term290905.getClass(), "dailyBonusDate", null);
        setField(term290905, term290905.getClass(), "dailyCourseBonusDate", null);
        setField(term290905, term290905.getClass(), "lastPairLoginDate", null);
        setField(term290905, term290905.getClass(), "lastTrialPlayDate", null);
        setIntField(term290905, term290905.getClass(), "playVsCount", 0);
        setIntField(term290905, term290905.getClass(), "playSyncCount", 0);
        setIntField(term290905, term290905.getClass(), "winCount", 0);
        setIntField(term290905, term290905.getClass(), "helpCount", 0);
        setIntField(term290905, term290905.getClass(), "comboCount", 0);
        setLongField(term290905, term290905.getClass(), "totalDeluxscore", 0L);
        setLongField(term290905, term290905.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290905, term290905.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290905, term290905.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290905, term290905.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290905, term290905.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290905, term290905.getClass(), "totalSync", 0);
        setIntField(term290905, term290905.getClass(), "totalBasicSync", 0);
        setIntField(term290905, term290905.getClass(), "totalAdvancedSync", 0);
        setIntField(term290905, term290905.getClass(), "totalExpertSync", 0);
        setIntField(term290905, term290905.getClass(), "totalMasterSync", 0);
        setIntField(term290905, term290905.getClass(), "totalReMasterSync", 0);
        setLongField(term290905, term290905.getClass(), "totalAchievement", 0L);
        setLongField(term290905, term290905.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290905, term290905.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290905, term290905.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290905, term290905.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290905, term290905.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290905, term290905.getClass(), "playerOldRating", 0L);
        setLongField(term290905, term290905.getClass(), "playerNewRating", 0L);
        setIntField(term290905, term290905.getClass(), "banState", 0);
        setLongField(term290905, term290905.getClass(), "dateTime", 0L);
        term290960 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290960;
        callMethod(klass, "setSelectMapId", argTypes, term290905, args);
    }

};


