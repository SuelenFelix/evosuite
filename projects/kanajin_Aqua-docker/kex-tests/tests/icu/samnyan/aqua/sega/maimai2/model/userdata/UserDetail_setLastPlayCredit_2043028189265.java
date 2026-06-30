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

public class UserDetail_setLastPlayCredit_2043028189265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291972;
     Object term292027;

    public UserDetail_setLastPlayCredit_2043028189265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291972 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        setLongField(term291972, term291972.getClass(), "id", 0L);
        setField(term291972, term291972.getClass(), "card", null);
        setField(term291972, term291972.getClass(), "userName", null);
        setIntField(term291972, term291972.getClass(), "isNetMember", 0);
        setIntField(term291972, term291972.getClass(), "iconId", 0);
        setIntField(term291972, term291972.getClass(), "plateId", 0);
        setIntField(term291972, term291972.getClass(), "titleId", 0);
        setIntField(term291972, term291972.getClass(), "partnerId", 0);
        setIntField(term291972, term291972.getClass(), "frameId", 0);
        setIntField(term291972, term291972.getClass(), "selectMapId", 0);
        setIntField(term291972, term291972.getClass(), "totalAwake", 0);
        setIntField(term291972, term291972.getClass(), "gradeRating", 0);
        setIntField(term291972, term291972.getClass(), "musicRating", 0);
        setIntField(term291972, term291972.getClass(), "playerRating", 0);
        setIntField(term291972, term291972.getClass(), "highestRating", 0);
        setIntField(term291972, term291972.getClass(), "gradeRank", 0);
        setIntField(term291972, term291972.getClass(), "classRank", 0);
        setIntField(term291972, term291972.getClass(), "courseRank", 0);
        setField(term291972, term291972.getClass(), "charaSlot", null);
        setField(term291972, term291972.getClass(), "charaLockSlot", null);
        setLongField(term291972, term291972.getClass(), "contentBit", 0L);
        setIntField(term291972, term291972.getClass(), "playCount", 0);
        setField(term291972, term291972.getClass(), "eventWatchedDate", null);
        setField(term291972, term291972.getClass(), "lastGameId", null);
        setField(term291972, term291972.getClass(), "lastRomVersion", null);
        setField(term291972, term291972.getClass(), "lastDataVersion", null);
        setField(term291972, term291972.getClass(), "lastLoginDate", null);
        setField(term291972, term291972.getClass(), "lastPlayDate", null);
        setIntField(term291972, term291972.getClass(), "lastPlayCredit", 0);
        setIntField(term291972, term291972.getClass(), "lastPlayMode", 0);
        setIntField(term291972, term291972.getClass(), "lastPlaceId", 0);
        setField(term291972, term291972.getClass(), "lastPlaceName", null);
        setIntField(term291972, term291972.getClass(), "lastAllNetId", 0);
        setIntField(term291972, term291972.getClass(), "lastRegionId", 0);
        setField(term291972, term291972.getClass(), "lastRegionName", null);
        setField(term291972, term291972.getClass(), "lastClientId", null);
        setField(term291972, term291972.getClass(), "lastCountryCode", null);
        setIntField(term291972, term291972.getClass(), "lastSelectEMoney", 0);
        setIntField(term291972, term291972.getClass(), "lastSelectTicket", 0);
        setIntField(term291972, term291972.getClass(), "lastSelectCourse", 0);
        setIntField(term291972, term291972.getClass(), "lastCountCourse", 0);
        setField(term291972, term291972.getClass(), "firstGameId", null);
        setField(term291972, term291972.getClass(), "firstRomVersion", null);
        setField(term291972, term291972.getClass(), "firstDataVersion", null);
        setField(term291972, term291972.getClass(), "firstPlayDate", null);
        setField(term291972, term291972.getClass(), "compatibleCmVersion", null);
        setField(term291972, term291972.getClass(), "dailyBonusDate", null);
        setField(term291972, term291972.getClass(), "dailyCourseBonusDate", null);
        setField(term291972, term291972.getClass(), "lastPairLoginDate", null);
        setField(term291972, term291972.getClass(), "lastTrialPlayDate", null);
        setIntField(term291972, term291972.getClass(), "playVsCount", 0);
        setIntField(term291972, term291972.getClass(), "playSyncCount", 0);
        setIntField(term291972, term291972.getClass(), "winCount", 0);
        setIntField(term291972, term291972.getClass(), "helpCount", 0);
        setIntField(term291972, term291972.getClass(), "comboCount", 0);
        setLongField(term291972, term291972.getClass(), "totalDeluxscore", 0L);
        setLongField(term291972, term291972.getClass(), "totalBasicDeluxscore", 0L);
        setLongField(term291972, term291972.getClass(), "totalAdvancedDeluxscore", 0L);
        setLongField(term291972, term291972.getClass(), "totalExpertDeluxscore", 0L);
        setLongField(term291972, term291972.getClass(), "totalMasterDeluxscore", 0L);
        setLongField(term291972, term291972.getClass(), "totalReMasterDeluxscore", 0L);
        setIntField(term291972, term291972.getClass(), "totalSync", 0);
        setIntField(term291972, term291972.getClass(), "totalBasicSync", 0);
        setIntField(term291972, term291972.getClass(), "totalAdvancedSync", 0);
        setIntField(term291972, term291972.getClass(), "totalExpertSync", 0);
        setIntField(term291972, term291972.getClass(), "totalMasterSync", 0);
        setIntField(term291972, term291972.getClass(), "totalReMasterSync", 0);
        setLongField(term291972, term291972.getClass(), "totalAchievement", 0L);
        setLongField(term291972, term291972.getClass(), "totalBasicAchievement", 0L);
        setLongField(term291972, term291972.getClass(), "totalAdvancedAchievement", 0L);
        setLongField(term291972, term291972.getClass(), "totalExpertAchievement", 0L);
        setLongField(term291972, term291972.getClass(), "totalMasterAchievement", 0L);
        setLongField(term291972, term291972.getClass(), "totalReMasterAchievement", 0L);
        setLongField(term291972, term291972.getClass(), "playerOldRating", 0L);
        setLongField(term291972, term291972.getClass(), "playerNewRating", 0L);
        setIntField(term291972, term291972.getClass(), "banState", 0);
        setLongField(term291972, term291972.getClass(), "dateTime", 0L);
        term292027 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292027;
        callMethod(klass, "setLastPlayCredit", argTypes, term291972, args);
    }

};


