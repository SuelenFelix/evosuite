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

public class UserDetail_setHelpCount_400240618290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293371;
     Object term293426;

    public UserDetail_setHelpCount_400240618290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293371 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term293371, term293371.getClass(), "id", 0L);
        setField(term293371, term293371.getClass(), "card", null);
        setField(term293371, term293371.getClass(), "userName", null);
        setIntField(term293371, term293371.getClass(), "isNetMember", 0);
        setIntField(term293371, term293371.getClass(), "iconId", 0);
        setIntField(term293371, term293371.getClass(), "plateId", 0);
        setIntField(term293371, term293371.getClass(), "titleId", 0);
        setIntField(term293371, term293371.getClass(), "partnerId", 0);
        setIntField(term293371, term293371.getClass(), "frameId", 0);
        setIntField(term293371, term293371.getClass(), "selectMapId", 0);
        setIntField(term293371, term293371.getClass(), "totalAwake", 0);
        setIntField(term293371, term293371.getClass(), "gradeRating", 0);
        setIntField(term293371, term293371.getClass(), "musicRating", 0);
        setIntField(term293371, term293371.getClass(), "playerRating", 0);
        setIntField(term293371, term293371.getClass(), "highestRating", 0);
        setIntField(term293371, term293371.getClass(), "gradeRank", 0);
        setIntField(term293371, term293371.getClass(), "classRank", 0);
        setIntField(term293371, term293371.getClass(), "courseRank", 0);
        setField(term293371, term293371.getClass(), "charaSlot", null);
        setField(term293371, term293371.getClass(), "charaLockSlot", null);
        setLongField(term293371, term293371.getClass(), "contentBit", 0L);
        setIntField(term293371, term293371.getClass(), "playCount", 0);
        setField(term293371, term293371.getClass(), "eventWatchedDate", null);
        setField(term293371, term293371.getClass(), "lastGameId", null);
        setField(term293371, term293371.getClass(), "lastRomVersion", null);
        setField(term293371, term293371.getClass(), "lastDataVersion", null);
        setField(term293371, term293371.getClass(), "lastLoginDate", null);
        setField(term293371, term293371.getClass(), "lastPlayDate", null);
        setIntField(term293371, term293371.getClass(), "lastPlayCredit", 0);
        setIntField(term293371, term293371.getClass(), "lastPlayMode", 0);
        setIntField(term293371, term293371.getClass(), "lastPlaceId", 0);
        setField(term293371, term293371.getClass(), "lastPlaceName", null);
        setIntField(term293371, term293371.getClass(), "lastAllNetId", 0);
        setIntField(term293371, term293371.getClass(), "lastRegionId", 0);
        setField(term293371, term293371.getClass(), "lastRegionName", null);
        setField(term293371, term293371.getClass(), "lastClientId", null);
        setField(term293371, term293371.getClass(), "lastCountryCode", null);
        setIntField(term293371, term293371.getClass(), "lastSelectEMoney", 0);
        setIntField(term293371, term293371.getClass(), "lastSelectTicket", 0);
        setIntField(term293371, term293371.getClass(), "lastSelectCourse", 0);
        setIntField(term293371, term293371.getClass(), "lastCountCourse", 0);
        setField(term293371, term293371.getClass(), "firstGameId", null);
        setField(term293371, term293371.getClass(), "firstRomVersion", null);
        setField(term293371, term293371.getClass(), "firstDataVersion", null);
        setField(term293371, term293371.getClass(), "firstPlayDate", null);
        setField(term293371, term293371.getClass(), "compatibleCmVersion", null);
        setField(term293371, term293371.getClass(), "dailyBonusDate", null);
        setField(term293371, term293371.getClass(), "dailyCourseBonusDate", null);
        setField(term293371, term293371.getClass(), "lastPairLoginDate", null);
        setField(term293371, term293371.getClass(), "lastTrialPlayDate", null);
        setIntField(term293371, term293371.getClass(), "playVsCount", 0);
        setIntField(term293371, term293371.getClass(), "playSyncCount", 0);
        setIntField(term293371, term293371.getClass(), "winCount", 0);
        setIntField(term293371, term293371.getClass(), "helpCount", 0);
        setIntField(term293371, term293371.getClass(), "comboCount", 0);
        setLongField(term293371, term293371.getClass(), "totalDeluxscore", 0L);
        setLongField(term293371, term293371.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term293371, term293371.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term293371, term293371.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term293371, term293371.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term293371, term293371.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term293371, term293371.getClass(), "totalSync", 0);
        setIntField(term293371, term293371.getClass(), "totalBasicSync", 0);
        setIntField(term293371, term293371.getClass(), "totalAdvancedSync", 0);
        setIntField(term293371, term293371.getClass(), "totalExpertSync", 0);
        setIntField(term293371, term293371.getClass(), "totalMasterSync", 0);
        setIntField(term293371, term293371.getClass(), "totalReMasterSync", 0);
        setLongField(term293371, term293371.getClass(), "totalAchievement", 0L);
        setLongField(term293371, term293371.getClass(), "totalBasicAchievement", 0L);
        setLongField(term293371, term293371.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term293371, term293371.getClass(), "totalExpertAchievement", 0L);
        setLongField(term293371, term293371.getClass(), "totalMasterAchievement", 0L);
        setLongField(term293371, term293371.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term293371, term293371.getClass(), "playerOldRating", 0L);
        setLongField(term293371, term293371.getClass(), "playerNewRating", 0L);
        setIntField(term293371, term293371.getClass(), "banState", 0);
        setLongField(term293371, term293371.getClass(), "dateTime", 0L);
        term293426 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term293426;
        callMethod(klass, "setHelpCount", argTypes, term293371, args);
    }

};


