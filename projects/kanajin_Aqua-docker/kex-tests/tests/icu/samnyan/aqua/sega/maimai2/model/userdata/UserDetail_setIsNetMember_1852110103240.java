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

public class UserDetail_setIsNetMember_1852110103240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290563;
     Object term290618;

    public UserDetail_setIsNetMember_1852110103240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290563 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term290563, term290563.getClass(), "id", 0L);
        setField(term290563, term290563.getClass(), "card", null);
        setField(term290563, term290563.getClass(), "userName", null);
        setIntField(term290563, term290563.getClass(), "isNetMember", 0);
        setIntField(term290563, term290563.getClass(), "iconId", 0);
        setIntField(term290563, term290563.getClass(), "plateId", 0);
        setIntField(term290563, term290563.getClass(), "titleId", 0);
        setIntField(term290563, term290563.getClass(), "partnerId", 0);
        setIntField(term290563, term290563.getClass(), "frameId", 0);
        setIntField(term290563, term290563.getClass(), "selectMapId", 0);
        setIntField(term290563, term290563.getClass(), "totalAwake", 0);
        setIntField(term290563, term290563.getClass(), "gradeRating", 0);
        setIntField(term290563, term290563.getClass(), "musicRating", 0);
        setIntField(term290563, term290563.getClass(), "playerRating", 0);
        setIntField(term290563, term290563.getClass(), "highestRating", 0);
        setIntField(term290563, term290563.getClass(), "gradeRank", 0);
        setIntField(term290563, term290563.getClass(), "classRank", 0);
        setIntField(term290563, term290563.getClass(), "courseRank", 0);
        setField(term290563, term290563.getClass(), "charaSlot", null);
        setField(term290563, term290563.getClass(), "charaLockSlot", null);
        setLongField(term290563, term290563.getClass(), "contentBit", 0L);
        setIntField(term290563, term290563.getClass(), "playCount", 0);
        setField(term290563, term290563.getClass(), "eventWatchedDate", null);
        setField(term290563, term290563.getClass(), "lastGameId", null);
        setField(term290563, term290563.getClass(), "lastRomVersion", null);
        setField(term290563, term290563.getClass(), "lastDataVersion", null);
        setField(term290563, term290563.getClass(), "lastLoginDate", null);
        setField(term290563, term290563.getClass(), "lastPlayDate", null);
        setIntField(term290563, term290563.getClass(), "lastPlayCredit", 0);
        setIntField(term290563, term290563.getClass(), "lastPlayMode", 0);
        setIntField(term290563, term290563.getClass(), "lastPlaceId", 0);
        setField(term290563, term290563.getClass(), "lastPlaceName", null);
        setIntField(term290563, term290563.getClass(), "lastAllNetId", 0);
        setIntField(term290563, term290563.getClass(), "lastRegionId", 0);
        setField(term290563, term290563.getClass(), "lastRegionName", null);
        setField(term290563, term290563.getClass(), "lastClientId", null);
        setField(term290563, term290563.getClass(), "lastCountryCode", null);
        setIntField(term290563, term290563.getClass(), "lastSelectEMoney", 0);
        setIntField(term290563, term290563.getClass(), "lastSelectTicket", 0);
        setIntField(term290563, term290563.getClass(), "lastSelectCourse", 0);
        setIntField(term290563, term290563.getClass(), "lastCountCourse", 0);
        setField(term290563, term290563.getClass(), "firstGameId", null);
        setField(term290563, term290563.getClass(), "firstRomVersion", null);
        setField(term290563, term290563.getClass(), "firstDataVersion", null);
        setField(term290563, term290563.getClass(), "firstPlayDate", null);
        setField(term290563, term290563.getClass(), "compatibleCmVersion", null);
        setField(term290563, term290563.getClass(), "dailyBonusDate", null);
        setField(term290563, term290563.getClass(), "dailyCourseBonusDate", null);
        setField(term290563, term290563.getClass(), "lastPairLoginDate", null);
        setField(term290563, term290563.getClass(), "lastTrialPlayDate", null);
        setIntField(term290563, term290563.getClass(), "playVsCount", 0);
        setIntField(term290563, term290563.getClass(), "playSyncCount", 0);
        setIntField(term290563, term290563.getClass(), "winCount", 0);
        setIntField(term290563, term290563.getClass(), "helpCount", 0);
        setIntField(term290563, term290563.getClass(), "comboCount", 0);
        setLongField(term290563, term290563.getClass(), "totalDeluxscore", 0L);
        setLongField(term290563, term290563.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term290563, term290563.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term290563, term290563.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term290563, term290563.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term290563, term290563.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term290563, term290563.getClass(), "totalSync", 0);
        setIntField(term290563, term290563.getClass(), "totalBasicSync", 0);
        setIntField(term290563, term290563.getClass(), "totalAdvancedSync", 0);
        setIntField(term290563, term290563.getClass(), "totalExpertSync", 0);
        setIntField(term290563, term290563.getClass(), "totalMasterSync", 0);
        setIntField(term290563, term290563.getClass(), "totalReMasterSync", 0);
        setLongField(term290563, term290563.getClass(), "totalAchievement", 0L);
        setLongField(term290563, term290563.getClass(), "totalBasicAchievement", 0L);
        setLongField(term290563, term290563.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term290563, term290563.getClass(), "totalExpertAchievement", 0L);
        setLongField(term290563, term290563.getClass(), "totalMasterAchievement", 0L);
        setLongField(term290563, term290563.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term290563, term290563.getClass(), "playerOldRating", 0L);
        setLongField(term290563, term290563.getClass(), "playerNewRating", 0L);
        setIntField(term290563, term290563.getClass(), "banState", 0);
        setLongField(term290563, term290563.getClass(), "dateTime", 0L);
        term290618 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290618;
        callMethod(klass, "setIsNetMember", argTypes, term290563, args);
    }

};


