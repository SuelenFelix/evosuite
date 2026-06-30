package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_setExtStr2_105343830400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292518;

    public UserData_setExtStr2_105343830400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292518 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292518, term292518.getClass(), "id", 0L);
        setField(term292518, term292518.getClass(), "card", null);
        setField(term292518, term292518.getClass(), "userName", null);
        setIntField(term292518, term292518.getClass(), "level", 0);
        setIntField(term292518, term292518.getClass(), "reincarnationNum", 0);
        setField(term292518, term292518.getClass(), "exp", null);
        setLongField(term292518, term292518.getClass(), "point", 0L);
        setLongField(term292518, term292518.getClass(), "totalPoint", 0L);
        setIntField(term292518, term292518.getClass(), "playCount", 0);
        setIntField(term292518, term292518.getClass(), "multiPlayCount", 0);
        setIntField(term292518, term292518.getClass(), "playerRating", 0);
        setIntField(term292518, term292518.getClass(), "highestRating", 0);
        setIntField(term292518, term292518.getClass(), "nameplateId", 0);
        setIntField(term292518, term292518.getClass(), "frameId", 0);
        setIntField(term292518, term292518.getClass(), "characterId", 0);
        setIntField(term292518, term292518.getClass(), "trophyId", 0);
        setIntField(term292518, term292518.getClass(), "playedTutorialBit", 0);
        setIntField(term292518, term292518.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292518, term292518.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292518, term292518.getClass(), "totalMapNum", 0);
        setLongField(term292518, term292518.getClass(), "totalHiScore", 0L);
        setLongField(term292518, term292518.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292518, term292518.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292518, term292518.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292518, term292518.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292518, term292518.getClass(), "totalUltimaHighScore", 0L);
        setField(term292518, term292518.getClass(), "eventWatchedDate", null);
        setIntField(term292518, term292518.getClass(), "friendCount", 0);
        setField(term292518, term292518.getClass(), "firstGameId", null);
        setField(term292518, term292518.getClass(), "firstRomVersion", null);
        setField(term292518, term292518.getClass(), "firstDataVersion", null);
        setField(term292518, term292518.getClass(), "firstPlayDate", null);
        setField(term292518, term292518.getClass(), "lastGameId", null);
        setField(term292518, term292518.getClass(), "lastRomVersion", null);
        setField(term292518, term292518.getClass(), "lastDataVersion", null);
        setField(term292518, term292518.getClass(), "lastLoginDate", null);
        setField(term292518, term292518.getClass(), "lastPlayDate", null);
        setIntField(term292518, term292518.getClass(), "lastPlaceId", 0);
        setField(term292518, term292518.getClass(), "lastPlaceName", null);
        setField(term292518, term292518.getClass(), "lastRegionId", null);
        setField(term292518, term292518.getClass(), "lastRegionName", null);
        setField(term292518, term292518.getClass(), "lastAllNetId", null);
        setField(term292518, term292518.getClass(), "lastClientId", null);
        setField(term292518, term292518.getClass(), "lastCountryCode", null);
        setField(term292518, term292518.getClass(), "userNameEx", null);
        setField(term292518, term292518.getClass(), "compatibleCmVersion", null);
        setIntField(term292518, term292518.getClass(), "medal", 0);
        setIntField(term292518, term292518.getClass(), "mapIconId", 0);
        setIntField(term292518, term292518.getClass(), "voiceId", 0);
        setIntField(term292518, term292518.getClass(), "avatarWear", 0);
        setIntField(term292518, term292518.getClass(), "avatarHead", 0);
        setIntField(term292518, term292518.getClass(), "avatarFace", 0);
        setIntField(term292518, term292518.getClass(), "avatarSkin", 0);
        setIntField(term292518, term292518.getClass(), "avatarItem", 0);
        setIntField(term292518, term292518.getClass(), "avatarFront", 0);
        setIntField(term292518, term292518.getClass(), "avatarBack", 0);
        setIntField(term292518, term292518.getClass(), "classEmblemBase", 0);
        setIntField(term292518, term292518.getClass(), "classEmblemMedal", 0);
        setIntField(term292518, term292518.getClass(), "stockedGridCount", 0);
        setIntField(term292518, term292518.getClass(), "exMapLoopCount", 0);
        setIntField(term292518, term292518.getClass(), "netBattlePlayCount", 0);
        setIntField(term292518, term292518.getClass(), "netBattleWinCount", 0);
        setIntField(term292518, term292518.getClass(), "netBattleLoseCount", 0);
        setIntField(term292518, term292518.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292518, term292518.getClass(), "charaIllustId", 0);
        setIntField(term292518, term292518.getClass(), "skillId", 0);
        setIntField(term292518, term292518.getClass(), "overPowerPoint", 0);
        setIntField(term292518, term292518.getClass(), "overPowerRate", 0);
        setIntField(term292518, term292518.getClass(), "overPowerLowerRank", 0);
        setIntField(term292518, term292518.getClass(), "avatarPoint", 0);
        setIntField(term292518, term292518.getClass(), "battleRankId", 0);
        setIntField(term292518, term292518.getClass(), "battleRankPoint", 0);
        setIntField(term292518, term292518.getClass(), "eliteRankPoint", 0);
        setIntField(term292518, term292518.getClass(), "netBattle1stCount", 0);
        setIntField(term292518, term292518.getClass(), "netBattle2ndCount", 0);
        setIntField(term292518, term292518.getClass(), "netBattle3rdCount", 0);
        setIntField(term292518, term292518.getClass(), "netBattle4thCount", 0);
        setIntField(term292518, term292518.getClass(), "netBattleCorrection", 0);
        setIntField(term292518, term292518.getClass(), "netBattleErrCnt", 0);
        setIntField(term292518, term292518.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292518, term292518.getClass(), "battleRewardStatus", 0);
        setIntField(term292518, term292518.getClass(), "battleRewardIndex", 0);
        setIntField(term292518, term292518.getClass(), "battleRewardCount", 0);
        setIntField(term292518, term292518.getClass(), "ext1", 0);
        setIntField(term292518, term292518.getClass(), "ext2", 0);
        setIntField(term292518, term292518.getClass(), "ext3", 0);
        setIntField(term292518, term292518.getClass(), "ext4", 0);
        setIntField(term292518, term292518.getClass(), "ext5", 0);
        setIntField(term292518, term292518.getClass(), "ext6", 0);
        setIntField(term292518, term292518.getClass(), "ext7", 0);
        setIntField(term292518, term292518.getClass(), "ext8", 0);
        setIntField(term292518, term292518.getClass(), "ext9", 0);
        setIntField(term292518, term292518.getClass(), "ext10", 0);
        setField(term292518, term292518.getClass(), "extStr1", null);
        setField(term292518, term292518.getClass(), "extStr2", null);
        setLongField(term292518, term292518.getClass(), "extLong1", 0L);
        setLongField(term292518, term292518.getClass(), "extLong2", 0L);
        setField(term292518, term292518.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292518, term292518.getClass(), "isNetBattleHost", false);
        setIntField(term292518, term292518.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExtStr2", argTypes, term292518, args);
    }

};


