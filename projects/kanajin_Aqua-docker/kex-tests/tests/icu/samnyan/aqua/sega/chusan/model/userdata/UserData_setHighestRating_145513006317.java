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

public class UserData_setHighestRating_145513006317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285999;
     Object term286076;

    public UserData_setHighestRating_145513006317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285999 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term285999, term285999.getClass(), "id", 0L);
        setField(term285999, term285999.getClass(), "card", null);
        setField(term285999, term285999.getClass(), "userName", null);
        setIntField(term285999, term285999.getClass(), "level", 0);
        setIntField(term285999, term285999.getClass(), "reincarnationNum", 0);
        setField(term285999, term285999.getClass(), "exp", null);
        setLongField(term285999, term285999.getClass(), "point", 0L);
        setLongField(term285999, term285999.getClass(), "totalPoint", 0L);
        setIntField(term285999, term285999.getClass(), "playCount", 0);
        setIntField(term285999, term285999.getClass(), "multiPlayCount", 0);
        setIntField(term285999, term285999.getClass(), "playerRating", 0);
        setIntField(term285999, term285999.getClass(), "highestRating", 0);
        setIntField(term285999, term285999.getClass(), "nameplateId", 0);
        setIntField(term285999, term285999.getClass(), "frameId", 0);
        setIntField(term285999, term285999.getClass(), "characterId", 0);
        setIntField(term285999, term285999.getClass(), "trophyId", 0);
        setIntField(term285999, term285999.getClass(), "playedTutorialBit", 0);
        setIntField(term285999, term285999.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term285999, term285999.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term285999, term285999.getClass(), "totalMapNum", 0);
        setLongField(term285999, term285999.getClass(), "totalHiScore", 0L);
        setLongField(term285999, term285999.getClass(), "totalBasicHighScore", 0L);
        setLongField(term285999, term285999.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term285999, term285999.getClass(), "totalExpertHighScore", 0L);
        setLongField(term285999, term285999.getClass(), "totalMasterHighScore", 0L);
        setLongField(term285999, term285999.getClass(), "totalUltimaHighScore", 0L);
        setField(term285999, term285999.getClass(), "eventWatchedDate", null);
        setIntField(term285999, term285999.getClass(), "friendCount", 0);
        setField(term285999, term285999.getClass(), "firstGameId", null);
        setField(term285999, term285999.getClass(), "firstRomVersion", null);
        setField(term285999, term285999.getClass(), "firstDataVersion", null);
        setField(term285999, term285999.getClass(), "firstPlayDate", null);
        setField(term285999, term285999.getClass(), "lastGameId", null);
        setField(term285999, term285999.getClass(), "lastRomVersion", null);
        setField(term285999, term285999.getClass(), "lastDataVersion", null);
        setField(term285999, term285999.getClass(), "lastLoginDate", null);
        setField(term285999, term285999.getClass(), "lastPlayDate", null);
        setIntField(term285999, term285999.getClass(), "lastPlaceId", 0);
        setField(term285999, term285999.getClass(), "lastPlaceName", null);
        setField(term285999, term285999.getClass(), "lastRegionId", null);
        setField(term285999, term285999.getClass(), "lastRegionName", null);
        setField(term285999, term285999.getClass(), "lastAllNetId", null);
        setField(term285999, term285999.getClass(), "lastClientId", null);
        setField(term285999, term285999.getClass(), "lastCountryCode", null);
        setField(term285999, term285999.getClass(), "userNameEx", null);
        setField(term285999, term285999.getClass(), "compatibleCmVersion", null);
        setIntField(term285999, term285999.getClass(), "medal", 0);
        setIntField(term285999, term285999.getClass(), "mapIconId", 0);
        setIntField(term285999, term285999.getClass(), "voiceId", 0);
        setIntField(term285999, term285999.getClass(), "avatarWear", 0);
        setIntField(term285999, term285999.getClass(), "avatarHead", 0);
        setIntField(term285999, term285999.getClass(), "avatarFace", 0);
        setIntField(term285999, term285999.getClass(), "avatarSkin", 0);
        setIntField(term285999, term285999.getClass(), "avatarItem", 0);
        setIntField(term285999, term285999.getClass(), "avatarFront", 0);
        setIntField(term285999, term285999.getClass(), "avatarBack", 0);
        setIntField(term285999, term285999.getClass(), "classEmblemBase", 0);
        setIntField(term285999, term285999.getClass(), "classEmblemMedal", 0);
        setIntField(term285999, term285999.getClass(), "stockedGridCount", 0);
        setIntField(term285999, term285999.getClass(), "exMapLoopCount", 0);
        setIntField(term285999, term285999.getClass(), "netBattlePlayCount", 0);
        setIntField(term285999, term285999.getClass(), "netBattleWinCount", 0);
        setIntField(term285999, term285999.getClass(), "netBattleLoseCount", 0);
        setIntField(term285999, term285999.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term285999, term285999.getClass(), "charaIllustId", 0);
        setIntField(term285999, term285999.getClass(), "skillId", 0);
        setIntField(term285999, term285999.getClass(), "overPowerPoint", 0);
        setIntField(term285999, term285999.getClass(), "overPowerRate", 0);
        setIntField(term285999, term285999.getClass(), "overPowerLowerRank", 0);
        setIntField(term285999, term285999.getClass(), "avatarPoint", 0);
        setIntField(term285999, term285999.getClass(), "battleRankId", 0);
        setIntField(term285999, term285999.getClass(), "battleRankPoint", 0);
        setIntField(term285999, term285999.getClass(), "eliteRankPoint", 0);
        setIntField(term285999, term285999.getClass(), "netBattle1stCount", 0);
        setIntField(term285999, term285999.getClass(), "netBattle2ndCount", 0);
        setIntField(term285999, term285999.getClass(), "netBattle3rdCount", 0);
        setIntField(term285999, term285999.getClass(), "netBattle4thCount", 0);
        setIntField(term285999, term285999.getClass(), "netBattleCorrection", 0);
        setIntField(term285999, term285999.getClass(), "netBattleErrCnt", 0);
        setIntField(term285999, term285999.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term285999, term285999.getClass(), "battleRewardStatus", 0);
        setIntField(term285999, term285999.getClass(), "battleRewardIndex", 0);
        setIntField(term285999, term285999.getClass(), "battleRewardCount", 0);
        setIntField(term285999, term285999.getClass(), "ext1", 0);
        setIntField(term285999, term285999.getClass(), "ext2", 0);
        setIntField(term285999, term285999.getClass(), "ext3", 0);
        setIntField(term285999, term285999.getClass(), "ext4", 0);
        setIntField(term285999, term285999.getClass(), "ext5", 0);
        setIntField(term285999, term285999.getClass(), "ext6", 0);
        setIntField(term285999, term285999.getClass(), "ext7", 0);
        setIntField(term285999, term285999.getClass(), "ext8", 0);
        setIntField(term285999, term285999.getClass(), "ext9", 0);
        setIntField(term285999, term285999.getClass(), "ext10", 0);
        setField(term285999, term285999.getClass(), "extStr1", null);
        setField(term285999, term285999.getClass(), "extStr2", null);
        setLongField(term285999, term285999.getClass(), "extLong1", 0L);
        setLongField(term285999, term285999.getClass(), "extLong2", 0L);
        setField(term285999, term285999.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term285999, term285999.getClass(), "isNetBattleHost", false);
        setIntField(term285999, term285999.getClass(), "netBattleEndState", 0);
        term286076 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286076;
        callMethod(klass, "setHighestRating", argTypes, term285999, args);
    }

};


