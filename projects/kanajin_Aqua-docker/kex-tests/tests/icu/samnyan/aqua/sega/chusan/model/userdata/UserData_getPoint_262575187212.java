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

public class UserData_getPoint_262575187212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277898;

    public UserData_getPoint_262575187212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277898 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term277898, term277898.getClass(), "id", 0L);
        setField(term277898, term277898.getClass(), "card", null);
        setField(term277898, term277898.getClass(), "userName", null);
        setIntField(term277898, term277898.getClass(), "level", 0);
        setIntField(term277898, term277898.getClass(), "reincarnationNum", 0);
        setField(term277898, term277898.getClass(), "exp", null);
        setLongField(term277898, term277898.getClass(), "point", 0L);
        setLongField(term277898, term277898.getClass(), "totalPoint", 0L);
        setIntField(term277898, term277898.getClass(), "playCount", 0);
        setIntField(term277898, term277898.getClass(), "multiPlayCount", 0);
        setIntField(term277898, term277898.getClass(), "playerRating", 0);
        setIntField(term277898, term277898.getClass(), "highestRating", 0);
        setIntField(term277898, term277898.getClass(), "nameplateId", 0);
        setIntField(term277898, term277898.getClass(), "frameId", 0);
        setIntField(term277898, term277898.getClass(), "characterId", 0);
        setIntField(term277898, term277898.getClass(), "trophyId", 0);
        setIntField(term277898, term277898.getClass(), "playedTutorialBit", 0);
        setIntField(term277898, term277898.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term277898, term277898.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term277898, term277898.getClass(), "totalMapNum", 0);
        setLongField(term277898, term277898.getClass(), "totalHiScore", 0L);
        setLongField(term277898, term277898.getClass(), "totalBasicHighScore", 0L);
        setLongField(term277898, term277898.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term277898, term277898.getClass(), "totalExpertHighScore", 0L);
        setLongField(term277898, term277898.getClass(), "totalMasterHighScore", 0L);
        setLongField(term277898, term277898.getClass(), "totalUltimaHighScore", 0L);
        setField(term277898, term277898.getClass(), "eventWatchedDate", null);
        setIntField(term277898, term277898.getClass(), "friendCount", 0);
        setField(term277898, term277898.getClass(), "firstGameId", null);
        setField(term277898, term277898.getClass(), "firstRomVersion", null);
        setField(term277898, term277898.getClass(), "firstDataVersion", null);
        setField(term277898, term277898.getClass(), "firstPlayDate", null);
        setField(term277898, term277898.getClass(), "lastGameId", null);
        setField(term277898, term277898.getClass(), "lastRomVersion", null);
        setField(term277898, term277898.getClass(), "lastDataVersion", null);
        setField(term277898, term277898.getClass(), "lastLoginDate", null);
        setField(term277898, term277898.getClass(), "lastPlayDate", null);
        setIntField(term277898, term277898.getClass(), "lastPlaceId", 0);
        setField(term277898, term277898.getClass(), "lastPlaceName", null);
        setField(term277898, term277898.getClass(), "lastRegionId", null);
        setField(term277898, term277898.getClass(), "lastRegionName", null);
        setField(term277898, term277898.getClass(), "lastAllNetId", null);
        setField(term277898, term277898.getClass(), "lastClientId", null);
        setField(term277898, term277898.getClass(), "lastCountryCode", null);
        setField(term277898, term277898.getClass(), "userNameEx", null);
        setField(term277898, term277898.getClass(), "compatibleCmVersion", null);
        setIntField(term277898, term277898.getClass(), "medal", 0);
        setIntField(term277898, term277898.getClass(), "mapIconId", 0);
        setIntField(term277898, term277898.getClass(), "voiceId", 0);
        setIntField(term277898, term277898.getClass(), "avatarWear", 0);
        setIntField(term277898, term277898.getClass(), "avatarHead", 0);
        setIntField(term277898, term277898.getClass(), "avatarFace", 0);
        setIntField(term277898, term277898.getClass(), "avatarSkin", 0);
        setIntField(term277898, term277898.getClass(), "avatarItem", 0);
        setIntField(term277898, term277898.getClass(), "avatarFront", 0);
        setIntField(term277898, term277898.getClass(), "avatarBack", 0);
        setIntField(term277898, term277898.getClass(), "classEmblemBase", 0);
        setIntField(term277898, term277898.getClass(), "classEmblemMedal", 0);
        setIntField(term277898, term277898.getClass(), "stockedGridCount", 0);
        setIntField(term277898, term277898.getClass(), "exMapLoopCount", 0);
        setIntField(term277898, term277898.getClass(), "netBattlePlayCount", 0);
        setIntField(term277898, term277898.getClass(), "netBattleWinCount", 0);
        setIntField(term277898, term277898.getClass(), "netBattleLoseCount", 0);
        setIntField(term277898, term277898.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term277898, term277898.getClass(), "charaIllustId", 0);
        setIntField(term277898, term277898.getClass(), "skillId", 0);
        setIntField(term277898, term277898.getClass(), "overPowerPoint", 0);
        setIntField(term277898, term277898.getClass(), "overPowerRate", 0);
        setIntField(term277898, term277898.getClass(), "overPowerLowerRank", 0);
        setIntField(term277898, term277898.getClass(), "avatarPoint", 0);
        setIntField(term277898, term277898.getClass(), "battleRankId", 0);
        setIntField(term277898, term277898.getClass(), "battleRankPoint", 0);
        setIntField(term277898, term277898.getClass(), "eliteRankPoint", 0);
        setIntField(term277898, term277898.getClass(), "netBattle1stCount", 0);
        setIntField(term277898, term277898.getClass(), "netBattle2ndCount", 0);
        setIntField(term277898, term277898.getClass(), "netBattle3rdCount", 0);
        setIntField(term277898, term277898.getClass(), "netBattle4thCount", 0);
        setIntField(term277898, term277898.getClass(), "netBattleCorrection", 0);
        setIntField(term277898, term277898.getClass(), "netBattleErrCnt", 0);
        setIntField(term277898, term277898.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term277898, term277898.getClass(), "battleRewardStatus", 0);
        setIntField(term277898, term277898.getClass(), "battleRewardIndex", 0);
        setIntField(term277898, term277898.getClass(), "battleRewardCount", 0);
        setIntField(term277898, term277898.getClass(), "ext1", 0);
        setIntField(term277898, term277898.getClass(), "ext2", 0);
        setIntField(term277898, term277898.getClass(), "ext3", 0);
        setIntField(term277898, term277898.getClass(), "ext4", 0);
        setIntField(term277898, term277898.getClass(), "ext5", 0);
        setIntField(term277898, term277898.getClass(), "ext6", 0);
        setIntField(term277898, term277898.getClass(), "ext7", 0);
        setIntField(term277898, term277898.getClass(), "ext8", 0);
        setIntField(term277898, term277898.getClass(), "ext9", 0);
        setIntField(term277898, term277898.getClass(), "ext10", 0);
        setField(term277898, term277898.getClass(), "extStr1", null);
        setField(term277898, term277898.getClass(), "extStr2", null);
        setLongField(term277898, term277898.getClass(), "extLong1", 0L);
        setLongField(term277898, term277898.getClass(), "extLong2", 0L);
        setField(term277898, term277898.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term277898, term277898.getClass(), "isNetBattleHost", false);
        setIntField(term277898, term277898.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term277898, args);
    }

};


