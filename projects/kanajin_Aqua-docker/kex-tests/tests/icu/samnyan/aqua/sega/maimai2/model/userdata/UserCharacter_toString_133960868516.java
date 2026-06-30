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

public class UserCharacter_toString_133960868516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194278;

    public UserCharacter_toString_133960868516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term194284 = new Long(-1164342036939643746L);
        Integer term194347 = new Integer(-808639910);
        Integer term194349 = new Integer(-2087767976);
        Integer term194351 = new Integer(1541808857);
        Integer term194353 = new Integer(2007310608);
        Integer term194355 = new Integer(462157519);
        Integer term194357 = new Integer(-875956888);
        Integer term194359 = new Integer(65647821);
        Integer term194361 = new Integer(-1289614562);
        ArrayList term194345 = new ArrayList();
        ((ArrayList) term194345).add(term194347);
        ((ArrayList) term194345).add(term194349);
        ((ArrayList) term194345).add(term194351);
        ((ArrayList) term194345).add(term194353);
        ((ArrayList) term194345).add(term194355);
        ((ArrayList) term194345).add(term194357);
        ((ArrayList) term194345).add(term194359);
        ((ArrayList) term194345).add(term194361);
        Integer term194367 = new Integer(201090501);
        Integer term194369 = new Integer(-1397182025);
        Integer term194371 = new Integer(-899619534);
        Integer term194373 = new Integer(1638508595);
        Integer term194375 = new Integer(-114151747);
        ArrayList term194365 = new ArrayList();
        ((ArrayList) term194365).add(term194367);
        ((ArrayList) term194365).add(term194369);
        ((ArrayList) term194365).add(term194371);
        ((ArrayList) term194365).add(term194373);
        ((ArrayList) term194365).add(term194375);
        term194278 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term194280 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term194282 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term194298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term194299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term194303 = newInstance(Class.forName("java.time.LocalTime"));
        Object term194308 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term194309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term194313 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term194278, term194278.getClass(), "id", -8223688673118674950L);
        setLongField(term194280, term194280.getClass(), "id", -8163869003949252164L);
        setLongField(term194282, term194282.getClass(), "id", -607756206767958766L);
        setField(term194282, term194282.getClass(), "extId", term194284);
        setField(term194282, term194282.getClass(), "luid", "cSIISDBvFn");
        setIntField(term194299, term194299.getClass(), "year", 2027);
        setShortField(term194299, term194299.getClass(), "month", (short) 7);
        setShortField(term194299, term194299.getClass(), "day", (short) 21);
        setField(term194298, term194298.getClass(), "date", term194299);
        setByteField(term194303, term194303.getClass(), "hour", (byte) 9);
        setByteField(term194303, term194303.getClass(), "minute", (byte) 42);
        setByteField(term194303, term194303.getClass(), "second", (byte) 16);
        setIntField(term194303, term194303.getClass(), "nano", 660359132);
        setField(term194298, term194298.getClass(), "time", term194303);
        setField(term194282, term194282.getClass(), "registerTime", term194298);
        setIntField(term194309, term194309.getClass(), "year", 2022);
        setShortField(term194309, term194309.getClass(), "month", (short) 12);
        setShortField(term194309, term194309.getClass(), "day", (short) 24);
        setField(term194308, term194308.getClass(), "date", term194309);
        setByteField(term194313, term194313.getClass(), "hour", (byte) 7);
        setByteField(term194313, term194313.getClass(), "minute", (byte) 20);
        setByteField(term194313, term194313.getClass(), "second", (byte) 0);
        setIntField(term194313, term194313.getClass(), "nano", 127843410);
        setField(term194308, term194308.getClass(), "time", term194313);
        setField(term194282, term194282.getClass(), "accessTime", term194308);
        setField(term194280, term194280.getClass(), "card", term194282);
        setField(term194280, term194280.getClass(), "userName", "UeVnwmFLjY");
        setIntField(term194280, term194280.getClass(), "isNetMember", 132693406);
        setIntField(term194280, term194280.getClass(), "iconId", -1100588127);
        setIntField(term194280, term194280.getClass(), "plateId", 1035089895);
        setIntField(term194280, term194280.getClass(), "titleId", 4217888);
        setIntField(term194280, term194280.getClass(), "partnerId", -1453563811);
        setIntField(term194280, term194280.getClass(), "frameId", -1548291822);
        setIntField(term194280, term194280.getClass(), "selectMapId", 1083791914);
        setIntField(term194280, term194280.getClass(), "totalAwake", 1266062345);
        setIntField(term194280, term194280.getClass(), "gradeRating", -547310147);
        setIntField(term194280, term194280.getClass(), "musicRating", 893881579);
        setIntField(term194280, term194280.getClass(), "playerRating", 198045917);
        setIntField(term194280, term194280.getClass(), "highestRating", -1667202438);
        setIntField(term194280, term194280.getClass(), "gradeRank", -2053124772);
        setIntField(term194280, term194280.getClass(), "classRank", -873131161);
        setIntField(term194280, term194280.getClass(), "courseRank", 1399978457);
        setField(term194280, term194280.getClass(), "charaSlot", term194345);
        setField(term194280, term194280.getClass(), "charaLockSlot", term194365);
        setLongField(term194280, term194280.getClass(), "contentBit", -5601362953809626317L);
        setIntField(term194280, term194280.getClass(), "playCount", -1973849284);
        setField(term194280, term194280.getClass(), "eventWatchedDate", "IIlFHyBACX");
        setField(term194280, term194280.getClass(), "lastGameId", "KYRCFppeJM");
        setField(term194280, term194280.getClass(), "lastRomVersion", "LFMqdKgGfW");
        setField(term194280, term194280.getClass(), "lastDataVersion", "aXKRWiZtNa");
        setField(term194280, term194280.getClass(), "lastLoginDate", "IvhFSqXGWI");
        setField(term194280, term194280.getClass(), "lastPlayDate", "XtSNlvtLvB");
        setIntField(term194280, term194280.getClass(), "lastPlayCredit", -1074349521);
        setIntField(term194280, term194280.getClass(), "lastPlayMode", -301274199);
        setIntField(term194280, term194280.getClass(), "lastPlaceId", 495802747);
        setField(term194280, term194280.getClass(), "lastPlaceName", "fNoIbYHFer");
        setIntField(term194280, term194280.getClass(), "lastAllNetId", -2002408985);
        setIntField(term194280, term194280.getClass(), "lastRegionId", -1289271829);
        setField(term194280, term194280.getClass(), "lastRegionName", "NbXrtSHLKQ");
        setField(term194280, term194280.getClass(), "lastClientId", "FLAHyvDmcn");
        setField(term194280, term194280.getClass(), "lastCountryCode", "ykqmQraXZT");
        setIntField(term194280, term194280.getClass(), "lastSelectEMoney", -1303889576);
        setIntField(term194280, term194280.getClass(), "lastSelectTicket", 158488233);
        setIntField(term194280, term194280.getClass(), "lastSelectCourse", 1641465748);
        setIntField(term194280, term194280.getClass(), "lastCountCourse", 191297190);
        setField(term194280, term194280.getClass(), "firstGameId", "yuvIUIQCMR");
        setField(term194280, term194280.getClass(), "firstRomVersion", "UiwzhuXDvB");
        setField(term194280, term194280.getClass(), "firstDataVersion", "LhpmrGuVxe");
        setField(term194280, term194280.getClass(), "firstPlayDate", "RcxoyfSpAy");
        setField(term194280, term194280.getClass(), "compatibleCmVersion", "JwsspZQNSy");
        setField(term194280, term194280.getClass(), "dailyBonusDate", "VCSuECypfF");
        setField(term194280, term194280.getClass(), "dailyCourseBonusDate", "VUlDErbXCX");
        setField(term194280, term194280.getClass(), "lastPairLoginDate", "vSTpfTsUuq");
        setField(term194280, term194280.getClass(), "lastTrialPlayDate", "eqrBBqDbzA");
        setIntField(term194280, term194280.getClass(), "playVsCount", -184116368);
        setIntField(term194280, term194280.getClass(), "playSyncCount", -2078321901);
        setIntField(term194280, term194280.getClass(), "winCount", 644110294);
        setIntField(term194280, term194280.getClass(), "helpCount", 858147518);
        setIntField(term194280, term194280.getClass(), "comboCount", -1727167401);
        setLongField(term194280, term194280.getClass(), "totalDeluxscore", -2963343028627970926L);
        setLongField(term194280, term194280.getClass(), "totalBasicDeluxscore", -3475893980837884356L);
        setLongField(term194280, term194280.getClass(), "totalAdvancedDeluxscore", -1973428419727299624L);
        setLongField(term194280, term194280.getClass(), "totalExpertDeluxscore", 4843893817805462778L);
        setLongField(term194280, term194280.getClass(), "totalMasterDeluxscore", 4337215445562937521L);
        setLongField(term194280, term194280.getClass(), "totalReMasterDeluxscore", -7398757265676461965L);
        setIntField(term194280, term194280.getClass(), "totalSync", -842185797);
        setIntField(term194280, term194280.getClass(), "totalBasicSync", 478918889);
        setIntField(term194280, term194280.getClass(), "totalAdvancedSync", 750079737);
        setIntField(term194280, term194280.getClass(), "totalExpertSync", -1296400594);
        setIntField(term194280, term194280.getClass(), "totalMasterSync", 1238281654);
        setIntField(term194280, term194280.getClass(), "totalReMasterSync", 369742636);
        setLongField(term194280, term194280.getClass(), "totalAchievement", -7596354887491898409L);
        setLongField(term194280, term194280.getClass(), "totalBasicAchievement", 3007092175291433144L);
        setLongField(term194280, term194280.getClass(), "totalAdvancedAchievement", 8977127578670073786L);
        setLongField(term194280, term194280.getClass(), "totalExpertAchievement", 4916750179173147465L);
        setLongField(term194280, term194280.getClass(), "totalMasterAchievement", 29705543197921155L);
        setLongField(term194280, term194280.getClass(), "totalReMasterAchievement", 5948824767935044534L);
        setLongField(term194280, term194280.getClass(), "playerOldRating", 6498754760108919381L);
        setLongField(term194280, term194280.getClass(), "playerNewRating", 5490377288658647689L);
        setIntField(term194280, term194280.getClass(), "banState", -1541868819);
        setLongField(term194280, term194280.getClass(), "dateTime", -7225879757464875307L);
        setField(term194278, term194278.getClass(), "user", term194280);
        setIntField(term194278, term194278.getClass(), "characterId", 1305998954);
        setIntField(term194278, term194278.getClass(), "level", 433793843);
        setIntField(term194278, term194278.getClass(), "awakening", -2139860020);
        setIntField(term194278, term194278.getClass(), "useCount", 1169604514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term194278, args);
    }

};


