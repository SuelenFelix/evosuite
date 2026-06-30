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

public class UserData_setCharacterId_814594127320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286236;
     Object term286313;

    public UserData_setCharacterId_814594127320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286236 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286236, term286236.getClass(), "id", 0L);
        setField(term286236, term286236.getClass(), "card", null);
        setField(term286236, term286236.getClass(), "userName", null);
        setIntField(term286236, term286236.getClass(), "level", 0);
        setIntField(term286236, term286236.getClass(), "reincarnationNum", 0);
        setField(term286236, term286236.getClass(), "exp", null);
        setLongField(term286236, term286236.getClass(), "point", 0L);
        setLongField(term286236, term286236.getClass(), "totalPoint", 0L);
        setIntField(term286236, term286236.getClass(), "playCount", 0);
        setIntField(term286236, term286236.getClass(), "multiPlayCount", 0);
        setIntField(term286236, term286236.getClass(), "playerRating", 0);
        setIntField(term286236, term286236.getClass(), "highestRating", 0);
        setIntField(term286236, term286236.getClass(), "nameplateId", 0);
        setIntField(term286236, term286236.getClass(), "frameId", 0);
        setIntField(term286236, term286236.getClass(), "characterId", 0);
        setIntField(term286236, term286236.getClass(), "trophyId", 0);
        setIntField(term286236, term286236.getClass(), "playedTutorialBit", 0);
        setIntField(term286236, term286236.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286236, term286236.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286236, term286236.getClass(), "totalMapNum", 0);
        setLongField(term286236, term286236.getClass(), "totalHiScore", 0L);
        setLongField(term286236, term286236.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286236, term286236.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286236, term286236.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286236, term286236.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286236, term286236.getClass(), "totalUltimaHighScore", 0L);
        setField(term286236, term286236.getClass(), "eventWatchedDate", null);
        setIntField(term286236, term286236.getClass(), "friendCount", 0);
        setField(term286236, term286236.getClass(), "firstGameId", null);
        setField(term286236, term286236.getClass(), "firstRomVersion", null);
        setField(term286236, term286236.getClass(), "firstDataVersion", null);
        setField(term286236, term286236.getClass(), "firstPlayDate", null);
        setField(term286236, term286236.getClass(), "lastGameId", null);
        setField(term286236, term286236.getClass(), "lastRomVersion", null);
        setField(term286236, term286236.getClass(), "lastDataVersion", null);
        setField(term286236, term286236.getClass(), "lastLoginDate", null);
        setField(term286236, term286236.getClass(), "lastPlayDate", null);
        setIntField(term286236, term286236.getClass(), "lastPlaceId", 0);
        setField(term286236, term286236.getClass(), "lastPlaceName", null);
        setField(term286236, term286236.getClass(), "lastRegionId", null);
        setField(term286236, term286236.getClass(), "lastRegionName", null);
        setField(term286236, term286236.getClass(), "lastAllNetId", null);
        setField(term286236, term286236.getClass(), "lastClientId", null);
        setField(term286236, term286236.getClass(), "lastCountryCode", null);
        setField(term286236, term286236.getClass(), "userNameEx", null);
        setField(term286236, term286236.getClass(), "compatibleCmVersion", null);
        setIntField(term286236, term286236.getClass(), "medal", 0);
        setIntField(term286236, term286236.getClass(), "mapIconId", 0);
        setIntField(term286236, term286236.getClass(), "voiceId", 0);
        setIntField(term286236, term286236.getClass(), "avatarWear", 0);
        setIntField(term286236, term286236.getClass(), "avatarHead", 0);
        setIntField(term286236, term286236.getClass(), "avatarFace", 0);
        setIntField(term286236, term286236.getClass(), "avatarSkin", 0);
        setIntField(term286236, term286236.getClass(), "avatarItem", 0);
        setIntField(term286236, term286236.getClass(), "avatarFront", 0);
        setIntField(term286236, term286236.getClass(), "avatarBack", 0);
        setIntField(term286236, term286236.getClass(), "classEmblemBase", 0);
        setIntField(term286236, term286236.getClass(), "classEmblemMedal", 0);
        setIntField(term286236, term286236.getClass(), "stockedGridCount", 0);
        setIntField(term286236, term286236.getClass(), "exMapLoopCount", 0);
        setIntField(term286236, term286236.getClass(), "netBattlePlayCount", 0);
        setIntField(term286236, term286236.getClass(), "netBattleWinCount", 0);
        setIntField(term286236, term286236.getClass(), "netBattleLoseCount", 0);
        setIntField(term286236, term286236.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286236, term286236.getClass(), "charaIllustId", 0);
        setIntField(term286236, term286236.getClass(), "skillId", 0);
        setIntField(term286236, term286236.getClass(), "overPowerPoint", 0);
        setIntField(term286236, term286236.getClass(), "overPowerRate", 0);
        setIntField(term286236, term286236.getClass(), "overPowerLowerRank", 0);
        setIntField(term286236, term286236.getClass(), "avatarPoint", 0);
        setIntField(term286236, term286236.getClass(), "battleRankId", 0);
        setIntField(term286236, term286236.getClass(), "battleRankPoint", 0);
        setIntField(term286236, term286236.getClass(), "eliteRankPoint", 0);
        setIntField(term286236, term286236.getClass(), "netBattle1stCount", 0);
        setIntField(term286236, term286236.getClass(), "netBattle2ndCount", 0);
        setIntField(term286236, term286236.getClass(), "netBattle3rdCount", 0);
        setIntField(term286236, term286236.getClass(), "netBattle4thCount", 0);
        setIntField(term286236, term286236.getClass(), "netBattleCorrection", 0);
        setIntField(term286236, term286236.getClass(), "netBattleErrCnt", 0);
        setIntField(term286236, term286236.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286236, term286236.getClass(), "battleRewardStatus", 0);
        setIntField(term286236, term286236.getClass(), "battleRewardIndex", 0);
        setIntField(term286236, term286236.getClass(), "battleRewardCount", 0);
        setIntField(term286236, term286236.getClass(), "ext1", 0);
        setIntField(term286236, term286236.getClass(), "ext2", 0);
        setIntField(term286236, term286236.getClass(), "ext3", 0);
        setIntField(term286236, term286236.getClass(), "ext4", 0);
        setIntField(term286236, term286236.getClass(), "ext5", 0);
        setIntField(term286236, term286236.getClass(), "ext6", 0);
        setIntField(term286236, term286236.getClass(), "ext7", 0);
        setIntField(term286236, term286236.getClass(), "ext8", 0);
        setIntField(term286236, term286236.getClass(), "ext9", 0);
        setIntField(term286236, term286236.getClass(), "ext10", 0);
        setField(term286236, term286236.getClass(), "extStr1", null);
        setField(term286236, term286236.getClass(), "extStr2", null);
        setLongField(term286236, term286236.getClass(), "extLong1", 0L);
        setLongField(term286236, term286236.getClass(), "extLong2", 0L);
        setField(term286236, term286236.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286236, term286236.getClass(), "isNetBattleHost", false);
        setIntField(term286236, term286236.getClass(), "netBattleEndState", 0);
        term286313 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286313;
        callMethod(klass, "setCharacterId", argTypes, term286236, args);
    }

};


