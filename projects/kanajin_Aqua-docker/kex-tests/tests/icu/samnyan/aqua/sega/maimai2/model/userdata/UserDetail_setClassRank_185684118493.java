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

public class UserDetail_setClassRank_185684118493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248223;
     Object term248590;

    public UserDetail_setClassRank_185684118493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term248227 = new Long(-1084263688306617320L);
        Integer term248290 = new Integer(-2056399026);
        Integer term248292 = new Integer(-150070327);
        Integer term248294 = new Integer(-731659931);
        Integer term248296 = new Integer(645238162);
        Integer term248298 = new Integer(-987757870);
        Integer term248300 = new Integer(2132585005);
        ArrayList term248288 = new ArrayList();
        ((ArrayList) term248288).add(term248290);
        ((ArrayList) term248288).add(term248292);
        ((ArrayList) term248288).add(term248294);
        ((ArrayList) term248288).add(term248296);
        ((ArrayList) term248288).add(term248298);
        ((ArrayList) term248288).add(term248300);
        Integer term248306 = new Integer(451557051);
        Integer term248308 = new Integer(71783796);
        Integer term248310 = new Integer(2085417929);
        Integer term248312 = new Integer(644887242);
        Integer term248314 = new Integer(1544325432);
        Integer term248316 = new Integer(908157389);
        Integer term248318 = new Integer(691619263);
        Integer term248320 = new Integer(637841150);
        ArrayList term248304 = new ArrayList();
        ((ArrayList) term248304).add(term248306);
        ((ArrayList) term248304).add(term248308);
        ((ArrayList) term248304).add(term248310);
        ((ArrayList) term248304).add(term248312);
        ((ArrayList) term248304).add(term248314);
        ((ArrayList) term248304).add(term248316);
        ((ArrayList) term248304).add(term248318);
        ((ArrayList) term248304).add(term248320);
        term248223 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term248225 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term248241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term248251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248256 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term248223, term248223.getClass(), "id", 6725789230896961855L);
        setLongField(term248225, term248225.getClass(), "id", 6442701473624740679L);
        setField(term248225, term248225.getClass(), "extId", term248227);
        setField(term248225, term248225.getClass(), "luid", "osTjagfbhA");
        setIntField(term248242, term248242.getClass(), "year", 2025);
        setShortField(term248242, term248242.getClass(), "month", (short) 5);
        setShortField(term248242, term248242.getClass(), "day", (short) 29);
        setField(term248241, term248241.getClass(), "date", term248242);
        setByteField(term248246, term248246.getClass(), "hour", (byte) 14);
        setByteField(term248246, term248246.getClass(), "minute", (byte) 31);
        setByteField(term248246, term248246.getClass(), "second", (byte) 17);
        setIntField(term248246, term248246.getClass(), "nano", 808113660);
        setField(term248241, term248241.getClass(), "time", term248246);
        setField(term248225, term248225.getClass(), "registerTime", term248241);
        setIntField(term248252, term248252.getClass(), "year", 2029);
        setShortField(term248252, term248252.getClass(), "month", (short) 9);
        setShortField(term248252, term248252.getClass(), "day", (short) 22);
        setField(term248251, term248251.getClass(), "date", term248252);
        setByteField(term248256, term248256.getClass(), "hour", (byte) 9);
        setByteField(term248256, term248256.getClass(), "minute", (byte) 11);
        setByteField(term248256, term248256.getClass(), "second", (byte) 48);
        setIntField(term248256, term248256.getClass(), "nano", 904292704);
        setField(term248251, term248251.getClass(), "time", term248256);
        setField(term248225, term248225.getClass(), "accessTime", term248251);
        setField(term248223, term248223.getClass(), "card", term248225);
        setField(term248223, term248223.getClass(), "userName", "KVJHdKBMKb");
        setIntField(term248223, term248223.getClass(), "isNetMember", 756673805);
        setIntField(term248223, term248223.getClass(), "iconId", -1760100052);
        setIntField(term248223, term248223.getClass(), "plateId", 1162383395);
        setIntField(term248223, term248223.getClass(), "titleId", -1210112971);
        setIntField(term248223, term248223.getClass(), "partnerId", 635840720);
        setIntField(term248223, term248223.getClass(), "frameId", 601832303);
        setIntField(term248223, term248223.getClass(), "selectMapId", -399801159);
        setIntField(term248223, term248223.getClass(), "totalAwake", 1268354860);
        setIntField(term248223, term248223.getClass(), "gradeRating", 155248036);
        setIntField(term248223, term248223.getClass(), "musicRating", 2012721194);
        setIntField(term248223, term248223.getClass(), "playerRating", -699142829);
        setIntField(term248223, term248223.getClass(), "highestRating", 1672191044);
        setIntField(term248223, term248223.getClass(), "gradeRank", 805828930);
        setIntField(term248223, term248223.getClass(), "classRank", -2013090834);
        setIntField(term248223, term248223.getClass(), "courseRank", -759354449);
        setField(term248223, term248223.getClass(), "charaSlot", term248288);
        setField(term248223, term248223.getClass(), "charaLockSlot", term248304);
        setLongField(term248223, term248223.getClass(), "contentBit", -9201109031588522217L);
        setIntField(term248223, term248223.getClass(), "playCount", -434381369);
        setField(term248223, term248223.getClass(), "eventWatchedDate", "hrhwpRIDFJ");
        setField(term248223, term248223.getClass(), "lastGameId", "eanYvfnxqY");
        setField(term248223, term248223.getClass(), "lastRomVersion", "WHYzVTgpKa");
        setField(term248223, term248223.getClass(), "lastDataVersion", "RjzDomTTbS");
        setField(term248223, term248223.getClass(), "lastLoginDate", "pGIWKlGIzp");
        setField(term248223, term248223.getClass(), "lastPlayDate", "PUZgBUGBmS");
        setIntField(term248223, term248223.getClass(), "lastPlayCredit", -855023218);
        setIntField(term248223, term248223.getClass(), "lastPlayMode", -1033073975);
        setIntField(term248223, term248223.getClass(), "lastPlaceId", 709673310);
        setField(term248223, term248223.getClass(), "lastPlaceName", "xLEiWtPonE");
        setIntField(term248223, term248223.getClass(), "lastAllNetId", 1902388445);
        setIntField(term248223, term248223.getClass(), "lastRegionId", -168790792);
        setField(term248223, term248223.getClass(), "lastRegionName", "wyDaOmiffy");
        setField(term248223, term248223.getClass(), "lastClientId", "mzQSpyiDzE");
        setField(term248223, term248223.getClass(), "lastCountryCode", "CTXGUQuXhq");
        setIntField(term248223, term248223.getClass(), "lastSelectEMoney", 1242770139);
        setIntField(term248223, term248223.getClass(), "lastSelectTicket", 377426122);
        setIntField(term248223, term248223.getClass(), "lastSelectCourse", -48674750);
        setIntField(term248223, term248223.getClass(), "lastCountCourse", 220935460);
        setField(term248223, term248223.getClass(), "firstGameId", "MIyWzhVoWw");
        setField(term248223, term248223.getClass(), "firstRomVersion", "rWAlzFyhnR");
        setField(term248223, term248223.getClass(), "firstDataVersion", "LphHrPlrqn");
        setField(term248223, term248223.getClass(), "firstPlayDate", "qQfbGGlBUn");
        setField(term248223, term248223.getClass(), "compatibleCmVersion", "nulHgoDPRO");
        setField(term248223, term248223.getClass(), "dailyBonusDate", "jiQYJRpWWs");
        setField(term248223, term248223.getClass(), "dailyCourseBonusDate", "UaGWyukANs");
        setField(term248223, term248223.getClass(), "lastPairLoginDate", "XHgoSKsgYP");
        setField(term248223, term248223.getClass(), "lastTrialPlayDate", "iQPdAhoTek");
        setIntField(term248223, term248223.getClass(), "playVsCount", 2086237225);
        setIntField(term248223, term248223.getClass(), "playSyncCount", 1865460346);
        setIntField(term248223, term248223.getClass(), "winCount", -1698946504);
        setIntField(term248223, term248223.getClass(), "helpCount", 1409263564);
        setIntField(term248223, term248223.getClass(), "comboCount", -62191184);
        setLongField(term248223, term248223.getClass(), "totalDeluxscore", -809623053406068285L);
        setLongField(term248223, term248223.getClass(), "totalBasicDeluxscore", -472443514275498081L);
        setLongField(term248223, term248223.getClass(), "totalAdvancedDeluxscore", 2206381981371013379L);
        setLongField(term248223, term248223.getClass(), "totalExpertDeluxscore", -2399498275440260409L);
        setLongField(term248223, term248223.getClass(), "totalMasterDeluxscore", 5994662171699621795L);
        setLongField(term248223, term248223.getClass(), "totalReMasterDeluxscore", 4136533657716463569L);
        setIntField(term248223, term248223.getClass(), "totalSync", 274246292);
        setIntField(term248223, term248223.getClass(), "totalBasicSync", -473433665);
        setIntField(term248223, term248223.getClass(), "totalAdvancedSync", -853321243);
        setIntField(term248223, term248223.getClass(), "totalExpertSync", 1780578237);
        setIntField(term248223, term248223.getClass(), "totalMasterSync", 852290211);
        setIntField(term248223, term248223.getClass(), "totalReMasterSync", -492713212);
        setLongField(term248223, term248223.getClass(), "totalAchievement", 6501665028385517226L);
        setLongField(term248223, term248223.getClass(), "totalBasicAchievement", 4846208274662840851L);
        setLongField(term248223, term248223.getClass(), "totalAdvancedAchievement", 6234067722949346799L);
        setLongField(term248223, term248223.getClass(), "totalExpertAchievement", 4337206851721971194L);
        setLongField(term248223, term248223.getClass(), "totalMasterAchievement", -2641408538515668296L);
        setLongField(term248223, term248223.getClass(), "totalReMasterAchievement", 7803645234880158290L);
        setLongField(term248223, term248223.getClass(), "playerOldRating", 1430208667127778467L);
        setLongField(term248223, term248223.getClass(), "playerNewRating", -619135166800870973L);
        setIntField(term248223, term248223.getClass(), "banState", -928681728);
        setLongField(term248223, term248223.getClass(), "dateTime", -6520640966747304759L);
        term248590 = new Integer(29193083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term248590;
        callMethod(klass, "setClassRank", argTypes, term248223, args);
    }

};


