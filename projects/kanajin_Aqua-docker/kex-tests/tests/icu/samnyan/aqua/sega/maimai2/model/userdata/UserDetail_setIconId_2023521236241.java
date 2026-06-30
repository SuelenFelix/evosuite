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

public class UserDetail_setIconId_2023521236241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290620;
     Object term290675;

    public UserDetail_setIconId_2023521236241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290620 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290620, term290620.getClass(), "id", 0L);
        setField(term290620, term290620.getClass(), "card", null);
        setField(term290620, term290620.getClass(), "userName", null);
        setIntField(term290620, term290620.getClass(), "isNetMember", 0);
        setIntField(term290620, term290620.getClass(), "iconId", 0);
        setIntField(term290620, term290620.getClass(), "plateId", 0);
        setIntField(term290620, term290620.getClass(), "titleId", 0);
        setIntField(term290620, term290620.getClass(), "partnerId", 0);
        setIntField(term290620, term290620.getClass(), "frameId", 0);
        setIntField(term290620, term290620.getClass(), "selectMapId", 0);
        setIntField(term290620, term290620.getClass(), "totalAwake", 0);
        setIntField(term290620, term290620.getClass(), "gradeRating", 0);
        setIntField(term290620, term290620.getClass(), "musicRating", 0);
        setIntField(term290620, term290620.getClass(), "playerRating", 0);
        setIntField(term290620, term290620.getClass(), "highestRating", 0);
        setIntField(term290620, term290620.getClass(), "gradeRank", 0);
        setIntField(term290620, term290620.getClass(), "classRank", 0);
        setIntField(term290620, term290620.getClass(), "courseRank", 0);
        setField(term290620, term290620.getClass(), "charaSlot", null);
        setField(term290620, term290620.getClass(), "charaLockSlot", null);
        setLongField(term290620, term290620.getClass(), "contentBit", 0L);
        setIntField(term290620, term290620.getClass(), "playCount", 0);
        setField(term290620, term290620.getClass(), "eventWatchedDate", null);
        setField(term290620, term290620.getClass(), "lastGameId", null);
        setField(term290620, term290620.getClass(), "lastRomVersion", null);
        setField(term290620, term290620.getClass(), "lastDataVersion", null);
        setField(term290620, term290620.getClass(), "lastLoginDate", null);
        setField(term290620, term290620.getClass(), "lastPlayDate", null);
        setIntField(term290620, term290620.getClass(), "lastPlayCredit", 0);
        setIntField(term290620, term290620.getClass(), "lastPlayMode", 0);
        setIntField(term290620, term290620.getClass(), "lastPlaceId", 0);
        setField(term290620, term290620.getClass(), "lastPlaceName", null);
        setIntField(term290620, term290620.getClass(), "lastAllNetId", 0);
        setIntField(term290620, term290620.getClass(), "lastRegionId", 0);
        setField(term290620, term290620.getClass(), "lastRegionName", null);
        setField(term290620, term290620.getClass(), "lastClientId", null);
        setField(term290620, term290620.getClass(), "lastCountryCode", null);
        setIntField(term290620, term290620.getClass(), "lastSelectEMoney", 0);
        setIntField(term290620, term290620.getClass(), "lastSelectTicket", 0);
        setIntField(term290620, term290620.getClass(), "lastSelectCourse", 0);
        setIntField(term290620, term290620.getClass(), "lastCountCourse", 0);
        setField(term290620, term290620.getClass(), "firstGameId", null);
        setField(term290620, term290620.getClass(), "firstRomVersion", null);
        setField(term290620, term290620.getClass(), "firstDataVersion", null);
        setField(term290620, term290620.getClass(), "firstPlayDate", null);
        setField(term290620, term290620.getClass(), "compatibleCmVersion", null);
        setField(term290620, term290620.getClass(), "dailyBonusDate", null);
        setField(term290620, term290620.getClass(), "dailyCourseBonusDate", null);
        setField(term290620, term290620.getClass(), "lastPairLoginDate", null);
        setField(term290620, term290620.getClass(), "lastTrialPlayDate", null);
        setIntField(term290620, term290620.getClass(), "playVsCount", 0);
        setIntField(term290620, term290620.getClass(), "playSyncCount", 0);
        setIntField(term290620, term290620.getClass(), "winCount", 0);
        setIntField(term290620, term290620.getClass(), "helpCount", 0);
        setIntField(term290620, term290620.getClass(), "comboCount", 0);
        setLongField(term290620, term290620.getClass(), "totalDeluxscore", 0L);
        setLongField(term290620, term290620.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290620, term290620.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290620, term290620.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290620, term290620.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290620, term290620.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290620, term290620.getClass(), "totalSync", 0);
        setIntField(term290620, term290620.getClass(), "totalBasicSync", 0);
        setIntField(term290620, term290620.getClass(), "totalAdvancedSync", 0);
        setIntField(term290620, term290620.getClass(), "totalExpertSync", 0);
        setIntField(term290620, term290620.getClass(), "totalMasterSync", 0);
        setIntField(term290620, term290620.getClass(), "totalReMasterSync", 0);
        setLongField(term290620, term290620.getClass(), "totalAchievement", 0L);
        setLongField(term290620, term290620.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290620, term290620.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290620, term290620.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290620, term290620.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290620, term290620.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290620, term290620.getClass(), "playerOldRating", 0L);
        setLongField(term290620, term290620.getClass(), "playerNewRating", 0L);
        setIntField(term290620, term290620.getClass(), "banState", 0);
        setLongField(term290620, term290620.getClass(), "dateTime", 0L);
        term290675 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290675;
        callMethod(klass, "setIconId", argTypes, term290620, args);
    }

};


