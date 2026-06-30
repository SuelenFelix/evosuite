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
import java.lang.Integer;

public class UserData_setClassEmblemMedal_525780490363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289597;
     Object term289674;

    public UserData_setClassEmblemMedal_525780490363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289597 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289597, term289597.getClass(), "id", 0L);
        setField(term289597, term289597.getClass(), "card", null);
        setField(term289597, term289597.getClass(), "userName", null);
        setIntField(term289597, term289597.getClass(), "level", 0);
        setIntField(term289597, term289597.getClass(), "reincarnationNum", 0);
        setField(term289597, term289597.getClass(), "exp", null);
        setLongField(term289597, term289597.getClass(), "point", 0L);
        setLongField(term289597, term289597.getClass(), "totalPoint", 0L);
        setIntField(term289597, term289597.getClass(), "playCount", 0);
        setIntField(term289597, term289597.getClass(), "multiPlayCount", 0);
        setIntField(term289597, term289597.getClass(), "playerRating", 0);
        setIntField(term289597, term289597.getClass(), "highestRating", 0);
        setIntField(term289597, term289597.getClass(), "nameplateId", 0);
        setIntField(term289597, term289597.getClass(), "frameId", 0);
        setIntField(term289597, term289597.getClass(), "characterId", 0);
        setIntField(term289597, term289597.getClass(), "trophyId", 0);
        setIntField(term289597, term289597.getClass(), "playedTutorialBit", 0);
        setIntField(term289597, term289597.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289597, term289597.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289597, term289597.getClass(), "totalMapNum", 0);
        setLongField(term289597, term289597.getClass(), "totalHiScore", 0L);
        setLongField(term289597, term289597.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289597, term289597.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289597, term289597.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289597, term289597.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289597, term289597.getClass(), "totalUltimaHighScore", 0L);
        setField(term289597, term289597.getClass(), "eventWatchedDate", null);
        setIntField(term289597, term289597.getClass(), "friendCount", 0);
        setField(term289597, term289597.getClass(), "firstGameId", null);
        setField(term289597, term289597.getClass(), "firstRomVersion", null);
        setField(term289597, term289597.getClass(), "firstDataVersion", null);
        setField(term289597, term289597.getClass(), "firstPlayDate", null);
        setField(term289597, term289597.getClass(), "lastGameId", null);
        setField(term289597, term289597.getClass(), "lastRomVersion", null);
        setField(term289597, term289597.getClass(), "lastDataVersion", null);
        setField(term289597, term289597.getClass(), "lastLoginDate", null);
        setField(term289597, term289597.getClass(), "lastPlayDate", null);
        setIntField(term289597, term289597.getClass(), "lastPlaceId", 0);
        setField(term289597, term289597.getClass(), "lastPlaceName", null);
        setField(term289597, term289597.getClass(), "lastRegionId", null);
        setField(term289597, term289597.getClass(), "lastRegionName", null);
        setField(term289597, term289597.getClass(), "lastAllNetId", null);
        setField(term289597, term289597.getClass(), "lastClientId", null);
        setField(term289597, term289597.getClass(), "lastCountryCode", null);
        setField(term289597, term289597.getClass(), "userNameEx", null);
        setField(term289597, term289597.getClass(), "compatibleCmVersion", null);
        setIntField(term289597, term289597.getClass(), "medal", 0);
        setIntField(term289597, term289597.getClass(), "mapIconId", 0);
        setIntField(term289597, term289597.getClass(), "voiceId", 0);
        setIntField(term289597, term289597.getClass(), "avatarWear", 0);
        setIntField(term289597, term289597.getClass(), "avatarHead", 0);
        setIntField(term289597, term289597.getClass(), "avatarFace", 0);
        setIntField(term289597, term289597.getClass(), "avatarSkin", 0);
        setIntField(term289597, term289597.getClass(), "avatarItem", 0);
        setIntField(term289597, term289597.getClass(), "avatarFront", 0);
        setIntField(term289597, term289597.getClass(), "avatarBack", 0);
        setIntField(term289597, term289597.getClass(), "classEmblemBase", 0);
        setIntField(term289597, term289597.getClass(), "classEmblemMedal", 0);
        setIntField(term289597, term289597.getClass(), "stockedGridCount", 0);
        setIntField(term289597, term289597.getClass(), "exMapLoopCount", 0);
        setIntField(term289597, term289597.getClass(), "netBattlePlayCount", 0);
        setIntField(term289597, term289597.getClass(), "netBattleWinCount", 0);
        setIntField(term289597, term289597.getClass(), "netBattleLoseCount", 0);
        setIntField(term289597, term289597.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289597, term289597.getClass(), "charaIllustId", 0);
        setIntField(term289597, term289597.getClass(), "skillId", 0);
        setIntField(term289597, term289597.getClass(), "overPowerPoint", 0);
        setIntField(term289597, term289597.getClass(), "overPowerRate", 0);
        setIntField(term289597, term289597.getClass(), "overPowerLowerRank", 0);
        setIntField(term289597, term289597.getClass(), "avatarPoint", 0);
        setIntField(term289597, term289597.getClass(), "battleRankId", 0);
        setIntField(term289597, term289597.getClass(), "battleRankPoint", 0);
        setIntField(term289597, term289597.getClass(), "eliteRankPoint", 0);
        setIntField(term289597, term289597.getClass(), "netBattle1stCount", 0);
        setIntField(term289597, term289597.getClass(), "netBattle2ndCount", 0);
        setIntField(term289597, term289597.getClass(), "netBattle3rdCount", 0);
        setIntField(term289597, term289597.getClass(), "netBattle4thCount", 0);
        setIntField(term289597, term289597.getClass(), "netBattleCorrection", 0);
        setIntField(term289597, term289597.getClass(), "netBattleErrCnt", 0);
        setIntField(term289597, term289597.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289597, term289597.getClass(), "battleRewardStatus", 0);
        setIntField(term289597, term289597.getClass(), "battleRewardIndex", 0);
        setIntField(term289597, term289597.getClass(), "battleRewardCount", 0);
        setIntField(term289597, term289597.getClass(), "ext1", 0);
        setIntField(term289597, term289597.getClass(), "ext2", 0);
        setIntField(term289597, term289597.getClass(), "ext3", 0);
        setIntField(term289597, term289597.getClass(), "ext4", 0);
        setIntField(term289597, term289597.getClass(), "ext5", 0);
        setIntField(term289597, term289597.getClass(), "ext6", 0);
        setIntField(term289597, term289597.getClass(), "ext7", 0);
        setIntField(term289597, term289597.getClass(), "ext8", 0);
        setIntField(term289597, term289597.getClass(), "ext9", 0);
        setIntField(term289597, term289597.getClass(), "ext10", 0);
        setField(term289597, term289597.getClass(), "extStr1", null);
        setField(term289597, term289597.getClass(), "extStr2", null);
        setLongField(term289597, term289597.getClass(), "extLong1", 0L);
        setLongField(term289597, term289597.getClass(), "extLong2", 0L);
        setField(term289597, term289597.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289597, term289597.getClass(), "isNetBattleHost", false);
        setIntField(term289597, term289597.getClass(), "netBattleEndState", 0);
        term289674 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289674;
        callMethod(klass, "setClassEmblemMedal", argTypes, term289597, args);
    }

};


