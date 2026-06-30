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
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setLastRomVersion_1566772665101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4286942;

    public UserDetail_setLastRomVersion_1566772665101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4286946 = new Long(-7160579949074592420L);
        Integer term4287009 = new Integer(-391323239);
        Integer term4287011 = new Integer(563491270);
        Integer term4287013 = new Integer(1732544982);
        Integer term4287015 = new Integer(961758280);
        Integer term4287017 = new Integer(-1645689842);
        Integer term4287019 = new Integer(1363844724);
        ArrayList term4287007 = new ArrayList();
        ((ArrayList) term4287007).add(term4287009);
        ((ArrayList) term4287007).add(term4287011);
        ((ArrayList) term4287007).add(term4287013);
        ((ArrayList) term4287007).add(term4287015);
        ((ArrayList) term4287007).add(term4287017);
        ((ArrayList) term4287007).add(term4287019);
        Integer term4287025 = new Integer(63712079);
        Integer term4287027 = new Integer(146408738);
        Integer term4287029 = new Integer(-496409376);
        Integer term4287031 = new Integer(1373203092);
        Integer term4287033 = new Integer(-120921180);
        ArrayList term4287023 = new ArrayList();
        ((ArrayList) term4287023).add(term4287025);
        ((ArrayList) term4287023).add(term4287027);
        ((ArrayList) term4287023).add(term4287029);
        ((ArrayList) term4287023).add(term4287031);
        ((ArrayList) term4287023).add(term4287033);
        term4286942 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4286944 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4286960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4286961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4286965 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4286970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4286971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4286975 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4286942, term4286942.getClass(), "id", -6736395070191032546L);
        setLongField(term4286944, term4286944.getClass(), "id", 3236787968754118181L);
        setField(term4286944, term4286944.getClass(), "extId", term4286946);
        setField(term4286944, term4286944.getClass(), "luid", "kykUntXKRf");
        setIntField(term4286961, term4286961.getClass(), "year", 2017);
        setShortField(term4286961, term4286961.getClass(), "month", (short) 6);
        setShortField(term4286961, term4286961.getClass(), "day", (short) 15);
        setField(term4286960, term4286960.getClass(), "date", term4286961);
        setByteField(term4286965, term4286965.getClass(), "hour", (byte) 16);
        setByteField(term4286965, term4286965.getClass(), "minute", (byte) 9);
        setByteField(term4286965, term4286965.getClass(), "second", (byte) 12);
        setIntField(term4286965, term4286965.getClass(), "nano", 481638746);
        setField(term4286960, term4286960.getClass(), "time", term4286965);
        setField(term4286944, term4286944.getClass(), "registerTime", term4286960);
        setIntField(term4286971, term4286971.getClass(), "year", 2011);
        setShortField(term4286971, term4286971.getClass(), "month", (short) 7);
        setShortField(term4286971, term4286971.getClass(), "day", (short) 28);
        setField(term4286970, term4286970.getClass(), "date", term4286971);
        setByteField(term4286975, term4286975.getClass(), "hour", (byte) 19);
        setByteField(term4286975, term4286975.getClass(), "minute", (byte) 11);
        setByteField(term4286975, term4286975.getClass(), "second", (byte) 5);
        setIntField(term4286975, term4286975.getClass(), "nano", 697167376);
        setField(term4286970, term4286970.getClass(), "time", term4286975);
        setField(term4286944, term4286944.getClass(), "accessTime", term4286970);
        setField(term4286942, term4286942.getClass(), "card", term4286944);
        setField(term4286942, term4286942.getClass(), "userName", "IKkEtExAvl");
        setIntField(term4286942, term4286942.getClass(), "isNetMember", 1682018303);
        setIntField(term4286942, term4286942.getClass(), "iconId", 1623019807);
        setIntField(term4286942, term4286942.getClass(), "plateId", 206411480);
        setIntField(term4286942, term4286942.getClass(), "titleId", -2066211565);
        setIntField(term4286942, term4286942.getClass(), "partnerId", 2069967704);
        setIntField(term4286942, term4286942.getClass(), "frameId", -1049237988);
        setIntField(term4286942, term4286942.getClass(), "selectMapId", 1725670178);
        setIntField(term4286942, term4286942.getClass(), "totalAwake", -1811504459);
        setIntField(term4286942, term4286942.getClass(), "gradeRating", 2093631397);
        setIntField(term4286942, term4286942.getClass(), "musicRating", -1585042759);
        setIntField(term4286942, term4286942.getClass(), "playerRating", 726959448);
        setIntField(term4286942, term4286942.getClass(), "highestRating", 277806113);
        setIntField(term4286942, term4286942.getClass(), "gradeRank", 1119813619);
        setIntField(term4286942, term4286942.getClass(), "classRank", 601390772);
        setIntField(term4286942, term4286942.getClass(), "courseRank", -1509607982);
        setField(term4286942, term4286942.getClass(), "charaSlot", term4287007);
        setField(term4286942, term4286942.getClass(), "charaLockSlot", term4287023);
        setLongField(term4286942, term4286942.getClass(), "contentBit", 8332491430485696155L);
        setIntField(term4286942, term4286942.getClass(), "playCount", -551456961);
        setField(term4286942, term4286942.getClass(), "eventWatchedDate", "UBxDrfYfHR");
        setField(term4286942, term4286942.getClass(), "lastGameId", "hTyhHeUGUQ");
        setField(term4286942, term4286942.getClass(), "lastRomVersion", "ZOHCgidxyy");
        setField(term4286942, term4286942.getClass(), "lastDataVersion", "JIRFAxdutp");
        setField(term4286942, term4286942.getClass(), "lastLoginDate", "GraMYjuHPT");
        setField(term4286942, term4286942.getClass(), "lastPlayDate", "kSdiIuPtUj");
        setIntField(term4286942, term4286942.getClass(), "lastPlayCredit", -826787306);
        setIntField(term4286942, term4286942.getClass(), "lastPlayMode", -161337526);
        setIntField(term4286942, term4286942.getClass(), "lastPlaceId", 373976146);
        setField(term4286942, term4286942.getClass(), "lastPlaceName", "hyAQHgsspU");
        setIntField(term4286942, term4286942.getClass(), "lastAllNetId", -993491857);
        setIntField(term4286942, term4286942.getClass(), "lastRegionId", -791257670);
        setField(term4286942, term4286942.getClass(), "lastRegionName", "RlpsccQKTj");
        setField(term4286942, term4286942.getClass(), "lastClientId", "zRhrOTwzsW");
        setField(term4286942, term4286942.getClass(), "lastCountryCode", "RmwcxtPygg");
        setIntField(term4286942, term4286942.getClass(), "lastSelectEMoney", 1678666424);
        setIntField(term4286942, term4286942.getClass(), "lastSelectTicket", 1544742707);
        setIntField(term4286942, term4286942.getClass(), "lastSelectCourse", 256511916);
        setIntField(term4286942, term4286942.getClass(), "lastCountCourse", 748198072);
        setField(term4286942, term4286942.getClass(), "firstGameId", "TlofJJrDcw");
        setField(term4286942, term4286942.getClass(), "firstRomVersion", "AfNQYoCFiE");
        setField(term4286942, term4286942.getClass(), "firstDataVersion", "PcWqlogokK");
        setField(term4286942, term4286942.getClass(), "firstPlayDate", "XvHqdsSGis");
        setField(term4286942, term4286942.getClass(), "compatibleCmVersion", "Pntthvgxns");
        setField(term4286942, term4286942.getClass(), "dailyBonusDate", "npKgZqHyfc");
        setField(term4286942, term4286942.getClass(), "dailyCourseBonusDate", "oJKjxRkfbq");
        setField(term4286942, term4286942.getClass(), "lastPairLoginDate", "atJxBQveLa");
        setField(term4286942, term4286942.getClass(), "lastTrialPlayDate", "UUtGLBUciC");
        setIntField(term4286942, term4286942.getClass(), "playVsCount", -328833026);
        setIntField(term4286942, term4286942.getClass(), "playSyncCount", 1055027682);
        setIntField(term4286942, term4286942.getClass(), "winCount", 338503662);
        setIntField(term4286942, term4286942.getClass(), "helpCount", 853216426);
        setIntField(term4286942, term4286942.getClass(), "comboCount", -1372731675);
        setLongField(term4286942, term4286942.getClass(), "totalDeluxscore", 5730664799961188855L);
        setLongField(term4286942, term4286942.getClass(), "totalBasicDeluxscore", 6621583173051361487L);
        setLongField(term4286942, term4286942.getClass(), "totalAdvancedDeluxscore", 5474049659390839072L);
        setLongField(term4286942, term4286942.getClass(), "totalExpertDeluxscore", 7382196827156395698L);
        setLongField(term4286942, term4286942.getClass(), "totalMasterDeluxscore", -2056275395353262841L);
        setLongField(term4286942, term4286942.getClass(), "totalReMasterDeluxscore", 4076683803536209018L);
        setIntField(term4286942, term4286942.getClass(), "totalSync", 1280990861);
        setIntField(term4286942, term4286942.getClass(), "totalBasicSync", -669142832);
        setIntField(term4286942, term4286942.getClass(), "totalAdvancedSync", 1880211905);
        setIntField(term4286942, term4286942.getClass(), "totalExpertSync", -535401405);
        setIntField(term4286942, term4286942.getClass(), "totalMasterSync", -614242533);
        setIntField(term4286942, term4286942.getClass(), "totalReMasterSync", 13392499);
        setLongField(term4286942, term4286942.getClass(), "totalAchievement", 829998885273135224L);
        setLongField(term4286942, term4286942.getClass(), "totalBasicAchievement", -766091876410959111L);
        setLongField(term4286942, term4286942.getClass(), "totalAdvancedAchievement", 4252651592724527524L);
        setLongField(term4286942, term4286942.getClass(), "totalExpertAchievement", -2845710101489405117L);
        setLongField(term4286942, term4286942.getClass(), "totalMasterAchievement", 8562850392586174572L);
        setLongField(term4286942, term4286942.getClass(), "totalReMasterAchievement", 6012039651460165779L);
        setLongField(term4286942, term4286942.getClass(), "playerOldRating", -5548261656580485922L);
        setLongField(term4286942, term4286942.getClass(), "playerNewRating", -308522839012670354L);
        setIntField(term4286942, term4286942.getClass(), "banState", -2034273579);
        setLongField(term4286942, term4286942.getClass(), "dateTime", 3820353410513576447L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AxkfWhuvpU";
        callMethod(klass, "setLastRomVersion", argTypes, term4286942, args);
    }

};


