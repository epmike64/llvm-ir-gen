package com.fint.tools.llvmir

enum FType:
  // PrimitiveTypes
  case HalfTyID  ///< 16-bit floating point type
  case BFloatTyID  ///< 16-bit floating point type (7-bit significand)
  case FloatTyID ///< 32-bit floating point type
  case DoubleTyID ///< 64-bit floating point type
  case X86_FP80TyID ///< 80-bit floating point type (X87)
  case FP128TyID ///< 128-bit floating point type (112-bit significand)
  case PPC_FP128TyID ///< 128-bit floating point type (two 64-bits, PowerPC)
  case VoidTyID ///< type with no size
  case FBasicBlockTyID ///< BasicBlock
  case FBlockAddressTyID ///< BlockAddress
  case LabelTyID ///< Labels
  case MetadataTyID  ///< Metadata
  case X86_MMXTyID ///< MMX vectors (64 bits, X86 specific)
  case X86_AMXTyID ///< AMX vectors (8192 bits, X86 specific)
  case TokenTyID ///< Tokens

  // Derived types... see DerivedTypes.h file.
  case IntegerTyID ///< Arbitrary bit width integers
  case FunctionTyID ///< Functions
  case PointerTyID ///< Pointers
  case StructTyID ///< Structures
  case ArrayTyID ///< Arrays
  case FixedVectorTyID ///< Fixed width SIMD vector type
  case ScalableVectorTyID ///< Scalable SIMD vector type
