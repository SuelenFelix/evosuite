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
import java.lang.Long;

public class UserDetail_setTotalExpertAchievement_1286721729307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294340;
     Object term294395;

    public UserDetail_setTotalExpertAchievement_1286721729307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294340 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term294340, term294340.getClass(), "id", 0L);
        setField(term294340, term294340.getClass(), "card", null);
        setField(term294340, term294340.getClass(), "userName", null);
        setIntField(term294340, term294340.getClass(), "isNetMember", 0);
        setIntField(term294340, term294340.getClass(), "iconId", 0);
        setIntField(term294340, term294340.getClass(), "plateId", 0);
        setIntField(term294340, term294340.getClass(), "titleId", 0);
        setIntField(term294340, term294340.getClass(), "partnerId", 0);
        setIntField(term294340, term294340.getClass(), "frameId", 0);
        setIntField(term294340, term294340.getClass(), "selectMapId", 0);
        setIntField(term294340, term294340.getClass(), "totalAwake", 0);
        setIntField(term294340, term294340.getClass(), "gradeRating", 0);
        setIntField(term294340, term294340.getClass(), "musicRating", 0);
        setIntField(term294340, term294340.getClass(), "playerRating", 0);
        setIntField(term294340, term294340.getClass(), "highestRating", 0);
        setIntField(term294340, term294340.getClass(), "gradeRank", 0);
        setIntField(term294340, term294340.getClass(), "classRank", 0);
        setIntField(term294340, term294340.getClass(), "courseRank", 0);
        setField(term294340, term294340.getClass(), "charaSlot", null);
        setField(term294340, term294340.getClass(), "charaLockSlot", null);
        setLongField(term294340, term294340.getClass(), "contentBit", 0L);
        setIntField(term294340, term294340.getClass(), "playCount", 0);
        setField(term294340, term294340.getClass(), "eventWatchedDate", null);
        setField(term294340, term294340.getClass(), "lastGameId", null);
        setField(term294340, term294340.getClass(), "lastRomVersion", null);
        setField(term294340, term294340.getClass(), "lastDataVersion", null);
        setField(term294340, term294340.getClass(), "lastLoginDate", null);
        setField(term294340, term294340.getClass(), "lastPlayDate", null);
        setIntField(term294340, term294340.getClass(), "lastPlayCredit", 0);
        setIntField(term294340, term294340.getClass(), "lastPlayMode", 0);
        setIntField(term294340, term294340.getClass(), "lastPlaceId", 0);
        setField(term294340, term294340.getClass(), "lastPlaceName", null);
        setIntField(term294340, term294340.getClass(), "lastAllNetId", 0);
        setIntField(term294340, term294340.getClass(), "lastRegionId", 0);
        setField(term294340, term294340.getClass(), "lastRegionName", null);
        setField(term294340, term294340.getClass(), "lastClientId", null);
        setField(term294340, term294340.getClass(), "lastCountryCode", null);
        setIntField(term294340, term294340.getClass(), "lastSelectEMoney", 0);
        setIntField(term294340, term294340.getClass(), "lastSelectTicket", 0);
        setIntField(term294340, term294340.getClass(), "lastSelectCourse", 0);
        setIntField(term294340, term294340.getClass(), "lastCountCourse", 0);
        setField(term294340, term294340.getClass(), "firstGameId", null);
        setField(term294340, term294340.getClass(), "firstRomVersion", null);
        setField(term294340, term294340.getClass(), "firstDataVersion", null);
        setField(term294340, term294340.getClass(), "firstPlayDate", null);
        setField(term294340, term294340.getClass(), "compatibleCmVersion", null);
        setField(term294340, term294340.getClass(), "dailyBonusDate", null);
        setField(term294340, term294340.getClass(), "dailyCourseBonusDate", null);
        setField(term294340, term294340.getClass(), "lastPairLoginDate", null);
        setField(term294340, term294340.getClass(), "lastTrialPlayDate", null);
        setIntField(term294340, term294340.getClass(), "playVsCount", 0);
        setIntField(term294340, term294340.getClass(), "playSyncCount", 0);
        setIntField(term294340, term294340.getClass(), "winCount", 0);
        setIntField(term294340, term294340.getClass(), "helpCount", 0);
        setIntField(term294340, term294340.getClass(), "comboCount", 0);
        setLongField(term294340, term294340.getClass(), "totalDeluxscore", 0L);
        setLongField(term294340, term294340.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term294340, term294340.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term294340, term294340.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term294340, term294340.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term294340, term294340.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term294340, term294340.getClass(), "totalSync", 0);
        setIntField(term294340, term294340.getClass(), "totalBasicSync", 0);
        setIntField(term294340, term294340.getClass(), "totalAdvancedSync", 0);
        setIntField(term294340, term294340.getClass(), "totalExpertSync", 0);
        setIntField(term294340, term294340.getClass(), "totalMasterSync", 0);
        setIntField(term294340, term294340.getClass(), "totalReMasterSync", 0);
        setLongField(term294340, term294340.getClass(), "totalAchievement", 0L);
        setLongField(term294340, term294340.getClass(), "totalBasicAchievement", 0L);
        setLongField(term294340, term294340.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term294340, term294340.getClass(), "totalExpertAchievement", 0L);
        setLongField(term294340, term294340.getClass(), "totalMasterAchievement", 0L);
        setLongField(term294340, term294340.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term294340, term294340.getClass(), "playerOldRating", 0L);
        setLongField(term294340, term294340.getClass(), "playerNewRating", 0L);
        setIntField(term294340, term294340.getClass(), "banState", 0);
        setLongField(term294340, term294340.getClass(), "dateTime", 0L);
        term294395 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term294395;
        callMethod(klass, "setTotalExpertAchievement", argTypes, term294340, args);
    }

};


