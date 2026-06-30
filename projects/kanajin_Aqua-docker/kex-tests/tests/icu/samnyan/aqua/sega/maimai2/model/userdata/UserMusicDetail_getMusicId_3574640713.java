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

public class UserMusicDetail_getMusicId_3574640713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56678;

    public UserMusicDetail_getMusicId_3574640713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56684 = new Long(846579494941632714L);
        Integer term56747 = new Integer(934338954);
        Integer term56749 = new Integer(598635505);
        Integer term56751 = new Integer(-944986533);
        Integer term56753 = new Integer(1894454926);
        Integer term56755 = new Integer(1415142780);
        Integer term56757 = new Integer(-574105759);
        Integer term56759 = new Integer(-1165271567);
        ArrayList term56745 = new ArrayList();
        ((ArrayList) term56745).add(term56747);
        ((ArrayList) term56745).add(term56749);
        ((ArrayList) term56745).add(term56751);
        ((ArrayList) term56745).add(term56753);
        ((ArrayList) term56745).add(term56755);
        ((ArrayList) term56745).add(term56757);
        ((ArrayList) term56745).add(term56759);
        ArrayList term56763 = new ArrayList();
        term56678 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term56680 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term56682 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56703 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56713 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56678, term56678.getClass(), "id", -6366307783743902404L);
        setLongField(term56680, term56680.getClass(), "id", -1515418567631326771L);
        setLongField(term56682, term56682.getClass(), "id", 5849423766693913056L);
        setField(term56682, term56682.getClass(), "extId", term56684);
        setField(term56682, term56682.getClass(), "luid", "kmgEVEqTGa");
        setIntField(term56699, term56699.getClass(), "year", 2019);
        setShortField(term56699, term56699.getClass(), "month", (short) 7);
        setShortField(term56699, term56699.getClass(), "day", (short) 4);
        setField(term56698, term56698.getClass(), "date", term56699);
        setByteField(term56703, term56703.getClass(), "hour", (byte) 19);
        setByteField(term56703, term56703.getClass(), "minute", (byte) 20);
        setByteField(term56703, term56703.getClass(), "second", (byte) 59);
        setIntField(term56703, term56703.getClass(), "nano", 246784352);
        setField(term56698, term56698.getClass(), "time", term56703);
        setField(term56682, term56682.getClass(), "registerTime", term56698);
        setIntField(term56709, term56709.getClass(), "year", 2023);
        setShortField(term56709, term56709.getClass(), "month", (short) 7);
        setShortField(term56709, term56709.getClass(), "day", (short) 1);
        setField(term56708, term56708.getClass(), "date", term56709);
        setByteField(term56713, term56713.getClass(), "hour", (byte) 4);
        setByteField(term56713, term56713.getClass(), "minute", (byte) 33);
        setByteField(term56713, term56713.getClass(), "second", (byte) 9);
        setIntField(term56713, term56713.getClass(), "nano", 94365310);
        setField(term56708, term56708.getClass(), "time", term56713);
        setField(term56682, term56682.getClass(), "accessTime", term56708);
        setField(term56680, term56680.getClass(), "card", term56682);
        setField(term56680, term56680.getClass(), "userName", "qakIqInzyM");
        setIntField(term56680, term56680.getClass(), "isNetMember", -1043400736);
        setIntField(term56680, term56680.getClass(), "iconId", 497106793);
        setIntField(term56680, term56680.getClass(), "plateId", -1904196296);
        setIntField(term56680, term56680.getClass(), "titleId", -1857445668);
        setIntField(term56680, term56680.getClass(), "partnerId", -1481132293);
        setIntField(term56680, term56680.getClass(), "frameId", -1458633954);
        setIntField(term56680, term56680.getClass(), "selectMapId", 1334294885);
        setIntField(term56680, term56680.getClass(), "totalAwake", -711784035);
        setIntField(term56680, term56680.getClass(), "gradeRating", -497219797);
        setIntField(term56680, term56680.getClass(), "musicRating", 720453125);
        setIntField(term56680, term56680.getClass(), "playerRating", -860314891);
        setIntField(term56680, term56680.getClass(), "highestRating", -444697262);
        setIntField(term56680, term56680.getClass(), "gradeRank", -460183304);
        setIntField(term56680, term56680.getClass(), "classRank", -2123879019);
        setIntField(term56680, term56680.getClass(), "courseRank", -745063212);
        setField(term56680, term56680.getClass(), "charaSlot", term56745);
        setField(term56680, term56680.getClass(), "charaLockSlot", term56763);
        setLongField(term56680, term56680.getClass(), "contentBit", -6427825980816337085L);
        setIntField(term56680, term56680.getClass(), "playCount", 298277204);
        setField(term56680, term56680.getClass(), "eventWatchedDate", "EOsBgwlmva");
        setField(term56680, term56680.getClass(), "lastGameId", "qcSJruZuJy");
        setField(term56680, term56680.getClass(), "lastRomVersion", "NOSJtfgqAs");
        setField(term56680, term56680.getClass(), "lastDataVersion", "SUDRrjpChc");
        setField(term56680, term56680.getClass(), "lastLoginDate", "pmpprxfFwy");
        setField(term56680, term56680.getClass(), "lastPlayDate", "AQbnQoJwOO");
        setIntField(term56680, term56680.getClass(), "lastPlayCredit", 1536563217);
        setIntField(term56680, term56680.getClass(), "lastPlayMode", -449582867);
        setIntField(term56680, term56680.getClass(), "lastPlaceId", -650176523);
        setField(term56680, term56680.getClass(), "lastPlaceName", "NnicBPzNzw");
        setIntField(term56680, term56680.getClass(), "lastAllNetId", 2071056240);
        setIntField(term56680, term56680.getClass(), "lastRegionId", 1894657425);
        setField(term56680, term56680.getClass(), "lastRegionName", "WADNPbexnT");
        setField(term56680, term56680.getClass(), "lastClientId", "rMbsSfMKvX");
        setField(term56680, term56680.getClass(), "lastCountryCode", "oCsqRJXMBc");
        setIntField(term56680, term56680.getClass(), "lastSelectEMoney", -263942209);
        setIntField(term56680, term56680.getClass(), "lastSelectTicket", 820400430);
        setIntField(term56680, term56680.getClass(), "lastSelectCourse", -1841078275);
        setIntField(term56680, term56680.getClass(), "lastCountCourse", -875421053);
        setField(term56680, term56680.getClass(), "firstGameId", "npPxKNoqdS");
        setField(term56680, term56680.getClass(), "firstRomVersion", "tGgCtmAQPu");
        setField(term56680, term56680.getClass(), "firstDataVersion", "HokisXXNMR");
        setField(term56680, term56680.getClass(), "firstPlayDate", "JbtvoXZZHr");
        setField(term56680, term56680.getClass(), "compatibleCmVersion", "eMlkqCfrnK");
        setField(term56680, term56680.getClass(), "dailyBonusDate", "HCiwohQDUV");
        setField(term56680, term56680.getClass(), "dailyCourseBonusDate", "RRWTUIdKkl");
        setField(term56680, term56680.getClass(), "lastPairLoginDate", "pBnfJsGPNO");
        setField(term56680, term56680.getClass(), "lastTrialPlayDate", "hzaRTeUQpV");
        setIntField(term56680, term56680.getClass(), "playVsCount", 212464780);
        setIntField(term56680, term56680.getClass(), "playSyncCount", -1698447008);
        setIntField(term56680, term56680.getClass(), "winCount", 1429592368);
        setIntField(term56680, term56680.getClass(), "helpCount", -1997064536);
        setIntField(term56680, term56680.getClass(), "comboCount", 798438929);
        setLongField(term56680, term56680.getClass(), "totalDeluxscore", -4544154238206615974L);
        setLongField(term56680, term56680.getClass(), "totalBasicDeluxscore", -8215564577884889289L);
        setLongField(term56680, term56680.getClass(), "totalAdvancedDeluxscore", 5775606940711844192L);
        setLongField(term56680, term56680.getClass(), "totalExpertDeluxscore", 3087842062616805600L);
        setLongField(term56680, term56680.getClass(), "totalMasterDeluxscore", 4204500285938159509L);
        setLongField(term56680, term56680.getClass(), "totalReMasterDeluxscore", -1244994280899830819L);
        setIntField(term56680, term56680.getClass(), "totalSync", 795184090);
        setIntField(term56680, term56680.getClass(), "totalBasicSync", 1181730734);
        setIntField(term56680, term56680.getClass(), "totalAdvancedSync", -668958857);
        setIntField(term56680, term56680.getClass(), "totalExpertSync", -427688960);
        setIntField(term56680, term56680.getClass(), "totalMasterSync", 343387902);
        setIntField(term56680, term56680.getClass(), "totalReMasterSync", 1492345954);
        setLongField(term56680, term56680.getClass(), "totalAchievement", -6694319636219671027L);
        setLongField(term56680, term56680.getClass(), "totalBasicAchievement", -3473081969778151336L);
        setLongField(term56680, term56680.getClass(), "totalAdvancedAchievement", 6622018619505451280L);
        setLongField(term56680, term56680.getClass(), "totalExpertAchievement", 1984951428829541736L);
        setLongField(term56680, term56680.getClass(), "totalMasterAchievement", 281955242959047454L);
        setLongField(term56680, term56680.getClass(), "totalReMasterAchievement", 863677123934073271L);
        setLongField(term56680, term56680.getClass(), "playerOldRating", -3863836475734251469L);
        setLongField(term56680, term56680.getClass(), "playerNewRating", -490278022171411868L);
        setIntField(term56680, term56680.getClass(), "banState", 1891017572);
        setLongField(term56680, term56680.getClass(), "dateTime", -8013089614220844724L);
        setField(term56678, term56678.getClass(), "user", term56680);
        setIntField(term56678, term56678.getClass(), "musicId", -391361805);
        setIntField(term56678, term56678.getClass(), "level", 1171290917);
        setIntField(term56678, term56678.getClass(), "playCount", 267258768);
        setIntField(term56678, term56678.getClass(), "achievement", 1779008869);
        setIntField(term56678, term56678.getClass(), "comboStatus", -1058856035);
        setIntField(term56678, term56678.getClass(), "syncStatus", -91024448);
        setIntField(term56678, term56678.getClass(), "deluxscoreMax", -744517334);
        setIntField(term56678, term56678.getClass(), "scoreRank", -855464783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term56678, args);
    }

};


